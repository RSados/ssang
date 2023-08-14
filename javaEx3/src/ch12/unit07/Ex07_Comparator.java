package ch12.unit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex07_Comparator {
	public static void main(String[] args) {
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("도도도","010-1111",25));
		list.add(new UserDTO("후후후","010-2222",20));
		list.add(new UserDTO("가가가","010-3333",22));
		list.add(new UserDTO("마마마","010-5555",25));
		list.add(new UserDTO("마가가나","010-4444",23));
		
		disp("정렬전...",list);
		
		//이름 오름차순 정렬
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list, comp);
		
		disp("이름 오른차순...",list);
		
		//나이 오름차순 정렬
		Comparator<UserDTO> comp1 = new Comparator<UserDTO>() {
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		Collections.sort(list, comp1);
		
		disp("나이 오른차순...",list);
		
	}
	
	public static void disp(String title, List<UserDTO> list) {
		System.out.println(title);
		
		for(UserDTO dto : list) {
			System.out.print(dto.getName()+ "\t");
			System.out.print(dto.getTel()+ "\t");
			System.out.println(dto.getAge());
		}
	}

}

class UserDTO{
	private String name;
	private String tel;
	private int age;
	
	public UserDTO() {
		
	}
	
public UserDTO(String name, String tel, int age) {
	this.name = name;
	this.tel = tel;
	this.age = age;
		
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
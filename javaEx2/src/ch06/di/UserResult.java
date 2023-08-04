package ch06.di;

public class UserResult {
	private User user;
	
	public UserResult(User user) {
		this.user = user;
	}
	
	public void printAll() {
		UserVO[] list = user.getList();
		int count = user.getCount();
		
		System.out.println("이름\t나이\t결과");
		System.out.println("-------------------------");
		for(int i=0;i<count;i++) {
			UserVO vo = list[i];
			
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.println(vo.getAdult());
		}
		System.out.println();
	}

}

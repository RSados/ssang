package ch12.addr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public class AddressUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Address address = new Addresslmpl();
	
	
	public void menu() {
		int a;
		while(true) {
			try {		do {
				System.out.print("1.등록 2.수정 3.삭제 4.이름검색 5.리스트 6.종료 => ");
				a=Integer.parseInt(br.readLine());
			} while (a<1||a>7);
			if(a==6) {
				return;
			}
			switch(a) {
			
			case 1:insert();break;
			case 2:update();break;
			case 3:delete();break;
			case 4:findByName();break;
			case 5:list();break;
			}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	
		}
		
		
	}
	public void insert() {
		System.out.println("정보등록\n");
		AddressVO vo = new AddressVO();
		try {
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			System.out.print("전화번호 ? ");
			vo.settel(br.readLine());
			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());
			System.out.print("주소 ? ");
			vo.setAddress(br.readLine());
			System.out.print("등록일 ? ");
			vo.setDate(br.readLine());
			
			address.insertAddress(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	public void update() {
		String name;
		String tel;
		
		try {
			System.out.println("이름 번호");
			name=br.readLine();
			tel = br.readLine();
			
			AddressVO vo = address.readAddress(name, tel);
			if(vo==null) {
				System.out.println("없음");
				return;
			}
			System.out.println("수정할 주소?");
			vo.setAddress(br.readLine());
			
			System.out.println("수정완료..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void delete() {
		String name;
		String tel;
		
		try {
			System.out.println("삭제");
			name=br.readLine();
			tel = br.readLine();
			
			boolean b = address.deleteAddress(name, tel);
			
			if (b) {
				System.out.println("삭제 완료...");
			} else {
				System.out.println("등록된 정보가 아닙니다.");}
		} catch (Exception e) {
			e.printStackTrace();
		}System.out.println();
	}
	public void findByName() {
		String name;
		String tel;
		try {
			System.out.print("이름 ? ");
			name = br.readLine();
			System.out.print("번호 ? ");
			tel = br.readLine();
			AddressVO vo = address.readAddress(name,tel);
			
			
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.gettel()+"\t");
			System.out.print(vo.getBirth()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.println(vo.getDate()+"\t");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void list() {
		List<AddressVO> list = address.listAddress();
		
		for(AddressVO vo : list) {
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.gettel()+"\t");
			System.out.print(vo.getBirth()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.println(vo.getDate()+"\t");
		}
		
	}
	
	
	
	
	
	
	
	
	

}

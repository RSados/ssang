package ch12.addr;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Addresslmpl implements Address{
	private List<AddressVO> list = new ArrayList<AddressVO>();
	
	@Override
	public void insertAddress(AddressVO vo) {
		// 값을 입력하는 메소드
		Calendar cal = Calendar.getInstance();
		String now = String.format("%tF %tA\n", cal,cal);
		vo.setDate(now) ;//= Integer.parseInt(birth.substring(0,4));
		list.add(vo);
		
		
		
	}

	@Override
	public AddressVO readAddress(String name, String tel) {
		// 찾는 메소드
		for(AddressVO vo :list) {
			if(vo.getName().equals(name)|vo.gettel().equals(tel)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public List<AddressVO> listAddress() {
		// 전체출력하는 메소드
		return list;
	}

	@Override
	public List<AddressVO> listAddress(String name) {
		// 찾아서 출려하는 메소드
		return null;
	}

	@Override
	public boolean deleteAddress(String name, String tel) {
		// 값을 삭제하는 메소드
		AddressVO vo = readAddress(name,tel);
		
		if(vo==null) {
			return false;
		}
		list.remove(vo);
		return true;
	}

}

package ch12.unit02.addr1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AddressImpl implements Address {
	private List<AddressVO> list = new ArrayList<>();
	
	@Override
	public void insertAddress(AddressVO vo) {
		String s;
		Calendar cal =  Calendar.getInstance();
		s = String.format("%tF(%tA)", cal, cal);
		vo.setRegDate(s);

		list.add(vo);
	}

	@Override
	public AddressVO readAddress(String name, String tel) {
		for(AddressVO vo : list) {
			if(vo.getName().equals(name) && vo.getTel().equals(tel) ) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public List<AddressVO> listAddress() {
		return list;
	}

	@Override
	public List<AddressVO> listAddress(String name) {
		List<AddressVO> findList = new ArrayList<>();
		for(AddressVO vo : list) {
			if(vo.getName().indexOf(name)!=-1) {
				findList.add(vo);
			}
		}
		return findList;
	}

	@Override
	public boolean deleteAddress(String name, String tel) {
		AddressVO vo = readAddress(name, tel);
		
		if(vo==null) {
			return false;
		}
		
		list.remove(vo);
		
		return true;
	}

}

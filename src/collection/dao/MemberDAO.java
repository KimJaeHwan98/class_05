package collection.dao;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO {
	public static ArrayList<MemberDTO> arr; // = new arrayList 
	static {
		arr = new ArrayList<>();
		//arr.add(null)
	}
	public void register ( MemberDTO dto) {
		System.out.println("dao register 연동");
		//System.out.println(dto.getName());
		//System.out.println(dto.getAddr());
		arr.add(dto);
	}
	public ArrayList<MemberDTO> getData() {
		return arr;
	}
	public MemberDTO search(String name) {
		for(MemberDTO d : arr) {
			if(name.equals(d.getName() ) ) {
				return d;
				
			}
		}
		return null;
	}
}

// static 생성 후 등록해주면 연산기능을 추가할수있다.
//특정 장소에 연결하는 역할 dao
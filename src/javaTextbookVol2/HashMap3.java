package javaTextbookVol2;
import java.util.*;
public class HashMap3 {

	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		
		printList();
		
	}
	
	//그룹에 전화번호를 추가하는 메소드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);	//phoneBook해시맵에서 groupName과 key값이 일치하는 value를 가져와서 group해시맵에 저장
		group.put(tel, name);	//이름은 중복될 수 있으니 전화번호를 key로 저장한다.
	}
	
	//그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {	//phoneBook 해시맵이 groupName을 키로 갖고 있다면
			phoneBook.put(groupName, new HashMap());	//groupName키에 새로운 해시맵을 값으로 저장한다.
		}
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	//전화번호부 전체를 출력하는 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}

}

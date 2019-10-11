package javaTextbookVol2;
import java.util.*;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));	//HashMap에 Integer객체로 저장한다.
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();	//Set타입에다가 HashMap에 저장된 key와 value값을 묶어서 set타입으로 반환한 것을 set에 저장
		Iterator it = set.iterator();	//접근
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	//Map인터페이스 내부 인터페이스인 Entry인터페이스에  set 안의 값들을 저장(반복하면서 다 저장)
			System.out.println("이름: " + e.getKey() + ", 점수 : " + e.getValue());		//
		}
		
		set = map.keySet();	//HashMap에 저장된 모든 키가 저장된 set을 set참조변수에 저장
		System.out.println("참가자 명단: " + set);
		
		Collection values = map.values();	//values() HashMap에 저장된 모든 값을 컬렉션의 형태로 반환해서 Collection타입의 values참조변수에 저장
		it = values.iterator();	//values에 접근
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();	//Integer타입으로 형변환하여 i 에 저장 total에서 연산하려면 정수형이 돼야 하기 때문
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));	//Collections클래스의 정적메서드 max(), min()
	}

}

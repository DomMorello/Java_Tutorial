package javaTextbookVol2;
import java.util.*;
public class Properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		//prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop에 저장된 요소들을 Ennumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames();	//prop의 모든 키가 담긴 enumeration을 반환해서 e에 저장
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty("size"));
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = "+prop.getProperty("size"));
		System.out.println("capacity = "+prop.getProperty("loadfator", "0.75"));	//loadfactor라는 키가 없기 때문에 디폴트값인 0.75가 출력됨.
		
		System.out.println(prop);
		prop.list(System.out);
		
	}

}

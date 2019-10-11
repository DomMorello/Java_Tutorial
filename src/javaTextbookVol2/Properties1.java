package javaTextbookVol2;
import java.util.*;
public class Properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		//prop�� Ű�� ��(key, value)�� �����Ѵ�.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop�� ����� ��ҵ��� Ennumeration�� �̿��ؼ� ����Ѵ�.
		Enumeration e = prop.propertyNames();	//prop�� ��� Ű�� ��� enumeration�� ��ȯ�ؼ� e�� ����
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty("size"));
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = "+prop.getProperty("size"));
		System.out.println("capacity = "+prop.getProperty("loadfator", "0.75"));	//loadfactor��� Ű�� ���� ������ ����Ʈ���� 0.75�� ��µ�.
		
		System.out.println(prop);
		prop.list(System.out);
		
	}

}

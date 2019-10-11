package javaTextbookVol2;
import java.util.*;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(90));	//HashMap�� Integer��ü�� �����Ѵ�.
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		Set set = map.entrySet();	//SetŸ�Կ��ٰ� HashMap�� ����� key�� value���� ��� setŸ������ ��ȯ�� ���� set�� ����
		Iterator it = set.iterator();	//����
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	//Map�������̽� ���� �������̽��� Entry�������̽���  set ���� ������ ����(�ݺ��ϸ鼭 �� ����)
			System.out.println("�̸�: " + e.getKey() + ", ���� : " + e.getValue());		//
		}
		
		set = map.keySet();	//HashMap�� ����� ��� Ű�� ����� set�� set���������� ����
		System.out.println("������ ���: " + set);
		
		Collection values = map.values();	//values() HashMap�� ����� ��� ���� �÷����� ���·� ��ȯ�ؼ� CollectionŸ���� values���������� ����
		it = values.iterator();	//values�� ����
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();	//IntegerŸ������ ����ȯ�Ͽ� i �� ���� total���� �����Ϸ��� �������� �ž� �ϱ� ����
			total += i.intValue();
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));	//CollectionsŬ������ �����޼��� max(), min()
	}

}

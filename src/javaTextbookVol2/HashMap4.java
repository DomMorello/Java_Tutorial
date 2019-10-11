package javaTextbookVol2;
import java.util.*;
public class HashMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {	//data[i]�� ���� Ű������ ���� ������
				Integer value = (Integer)map.get(data[i]);	//data[i]�� ���� Integer value�� ����
				map.put(data[i], new Integer(value.intValue() + 1));	//�� value�� 1�� ���ؼ� map �ؽøʿ� ����
			}else {
				map.put(data[i], new Integer(1));	//Ű������ ���� ���� ������ 1�� �ؽøʿ� ����
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);	//String(char[] chArr)
	}

}

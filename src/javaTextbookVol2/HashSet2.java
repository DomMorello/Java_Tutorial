package javaTextbookVol2;
import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);	//LinkedList(Collection c)
		Collections.sort(list);	//Collection.sort(List list)
		System.out.println(list);
	}

}

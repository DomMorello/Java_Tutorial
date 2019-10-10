package javaTextbookVol2;
import java.util.*;
public class ListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());	//순방향으로 진행하면서 읽어온다.
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());	//역방향으로 진행하면서 읽어온다.
		}
		System.out.println();
	}

}

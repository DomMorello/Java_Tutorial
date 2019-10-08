package javaTextbookVol2;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LIMIT = 10;	//자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);	//+10은 크기를 약간 더 크게 잡아준 것
		
		for(int i=0; i < length; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}

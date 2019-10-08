package javaTextbookVol2;

import java.util.*;

public class Stack1 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();
		
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로'버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로'버튼을 누른 후 =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
		
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");	//peek() 스택에서 맨 위에 있는 객체를 반환함
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);	//url객체를 스택에 저장함
		if(!forward.empty())	//forward스택이 비어있지 않으면 
			forward.clear();	//forward스택을 비운다.
	}
	
	public static void goForward() {
		if(!forward.empty())	//forward스택이 비어있지 않으면
			back.push(forward.pop());	//forward스택의 맨 위에 있는 객체를 뽑아서 back스택에 그 객체를 저장한다. 
	}
	
	public static void goBack() {
		if(!back.empty())	//back스택이 비어있지 않으면
			forward.push(back.pop());	//back스택의 맨 위에 있는 객체를 뽑아서 forward스택에 그 객체를 저장한다.
	}
	
}

package javaTextbookVol2;

import java.util.*;

public class Stack1 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");
		
		printStatus();
		
		goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		printStatus();
		
		goBack();
		System.out.println("= '�ڷ�'��ư�� ���� �� =");
		printStatus();
		
		goForward();
		System.out.println("= '������'��ư�� ���� �� =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= ���ο� �ּҷ� �̵� �� =");
		printStatus();
		
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("���� ȭ���� '" + back.peek() + "' �Դϴ�.");	//peek() ���ÿ��� �� ���� �ִ� ��ü�� ��ȯ��
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);	//url��ü�� ���ÿ� ������
		if(!forward.empty())	//forward������ ������� ������ 
			forward.clear();	//forward������ ����.
	}
	
	public static void goForward() {
		if(!forward.empty())	//forward������ ������� ������
			back.push(forward.pop());	//forward������ �� ���� �ִ� ��ü�� �̾Ƽ� back���ÿ� �� ��ü�� �����Ѵ�. 
	}
	
	public static void goBack() {
		if(!back.empty())	//back������ ������� ������
			forward.push(back.pop());	//back������ �� ���� �ִ� ��ü�� �̾Ƽ� forward���ÿ� �� ��ü�� �����Ѵ�.
	}
	
}

package kbClass;
import java.util.Scanner;

/**
 * @author Dom_Morello
 * @Project TodayILearned
 * @Date 2019. 10. 22.
 */
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ȭ ������ �Է��� �ּ���");
		HelloMovie mv = new HelloMovie();
		mv.printInfo();
	}

}

class HelloMovie{
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String genre = sc.nextLine();
	String release = sc.nextLine();
	String audience = sc.nextLine();
	String rate = sc.nextLine();
	
	public void printInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("�帣: "+genre);
		System.out.println("��������: "+release);
		System.out.println("������: "+audience);
		System.out.println("����: "+rate);
	}
}

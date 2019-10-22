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

		System.out.println("영화 내용을 입력해 주세요");
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
		System.out.println("이름: "+name);
		System.out.println("장르: "+genre);
		System.out.println("개봉연도: "+release);
		System.out.println("관객수: "+audience);
		System.out.println("평점: "+rate);
	}
}

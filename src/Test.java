import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
	final int CASE_CONVERTER = 32;
	
	int i = 0;
//	//1번
	while(i < 26) {
		System.out.print((char)(97+i));
		i++;
	}
	System.out.println();
	//2번
	while(i < 26) {
		System.out.print((char)(122-i-CASE_CONVERTER));
		i++;
	}
	System.out.println();
	//3번
	while(i < 10) {
		System.out.print((char)(48 + i));
		i++;
	}
	System.out.println();
	//4번
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	while(i < input) {
		System.out.print((char)('A'+ i));
		i++;
	}
	System.out.println();
	//5번
	while(i < 10) {
		System.out.print((char)(Math.random()*25 + 65));
		i++;
	}
	
	
	
	
	}
}
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
	final int CASE_CONVERTER = 32;
	
	int i = 0;
//	//1��
	while(i < 26) {
		System.out.print((char)(97+i));
		i++;
	}
	System.out.println();
	//2��
	while(i < 26) {
		System.out.print((char)(122-i-CASE_CONVERTER));
		i++;
	}
	System.out.println();
	//3��
	while(i < 10) {
		System.out.print((char)(48 + i));
		i++;
	}
	System.out.println();
	//4��
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	while(i < input) {
		System.out.print((char)('A'+ i));
		i++;
	}
	System.out.println();
	//5��
	while(i < 10) {
		System.out.print((char)(Math.random()*25 + 65));
		i++;
	}
	
	
	
	
	}
}
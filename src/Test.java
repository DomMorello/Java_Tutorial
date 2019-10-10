import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double average = 0.0;
		int max = 0;

		
		for(int i=1; i < 11; i++) {
			int input = sc.nextInt();
			sum += input;
			average = (double)sum/i;
			System.out.println(i + "회 입력:" + input);
			System.out.println(">> stat: "+i+"회차 입력 "+input + "=> 누적합: " + sum + " 평균: " + average);
			
		
		}//for end
		
		System.out.println("최댓값:" + max);
		
	}
}
   
		

		
	


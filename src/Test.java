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
			System.out.println(i + "ȸ �Է�:" + input);
			System.out.println(">> stat: "+i+"ȸ�� �Է� "+input + "=> ������: " + sum + " ���: " + average);
			
		
		}//for end
		
		System.out.println("�ִ�:" + max);
		
	}
}
   
		

		
	


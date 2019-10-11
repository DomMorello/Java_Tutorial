import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {

//		int count = 0;
//		for(int i=1; i < 6; i++) {
//			for(int j=5; j > i; j--) {
//				System.out.print("   ");
//			}
//			
//			for(int k=0; k < i; k++) {
//				count++;
//				System.out.printf("%3d",count);
//			}
//			System.out.println();
//		}
//		
//		int count2 = 0;
//		for(int i=1; i < 6; i++) {
//			System.out.print(" ");
//			for(int j=0; j < 6-i; j++) {
//				count2++;
//				System.out.printf("%-3d", count2);
//			}
//			System.out.println();
//		}
		
		String[] strArr = {"승용차", "승합차", "오토바이", "자전거", "기차", "트럭", "버스", "로봇", "바비", "인형"};
		int[] arr = {3000, 4000, 3000, 5000, 6000, 10000, 12000, 8000, 4000, 7000};
		
		System.out.println("|\t번호\t|\t이름\t|\t가격\t|");
		for(int i=0; i < arr.length; i++) {
			System.out.println("|\t"+(i+1)+"\t|"+"\t"+strArr[i]+"\t|"+"\t"+arr[i]+"원\t|");
		}
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("-------------------------------------------------");
		System.out.println("총 "+arr.length+"개의 장난감 가격 합 = "+sum+"원");
	}
}
	

		
	


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
		
		String[] strArr = {"�¿���", "������", "�������", "������", "����", "Ʈ��", "����", "�κ�", "�ٺ�", "����"};
		int[] arr = {3000, 4000, 3000, 5000, 6000, 10000, 12000, 8000, 4000, 7000};
		
		System.out.println("|\t��ȣ\t|\t�̸�\t|\t����\t|");
		for(int i=0; i < arr.length; i++) {
			System.out.println("|\t"+(i+1)+"\t|"+"\t"+strArr[i]+"\t|"+"\t"+arr[i]+"��\t|");
		}
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("-------------------------------------------------");
		System.out.println("�� "+arr.length+"���� �峭�� ���� �� = "+sum+"��");
	}
}
	

		
	


import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		int input1 = sc.nextInt();
		
	if(input1 == 00) {
		break;
	}
		
		switch(input1) {
		case 1 : System.out.println("��");
		break;
		case 2 : System.out.println("��");
		break;
		case 3 : System.out.println("��");
		break;
		case 4 : System.out.println("��");
		break;
		case 5 : System.out.println("��");
		break;
		case 6 : System.out.println("��");
		break;
		case 7 : System.out.println("��");
		break;
		case 8 : System.out.println("��\'");
		break;
		}
	}
		int input = sc.nextInt();
		noteMaker(input);
	}
	
	public static void noteMaker(int userInput) { //2�� ���� �޼ҵ�
	      int cnt = 0; //�ݺ����� �� �� ������ count�ϴ� ����
	      int index = 0; //1���� 4����� �̷���������� �����ϱ� ���� index ����
	      int ranNum = 0; //����(��~��') ������ ���� ����
	      String note = "";
	      String ans = "";      
	      
	      System.out.println("===========���̸� ��� ���α׷�===========");
	      System.out.println("���� �� �Է� : " + userInput +"\n");
	      
	      while(cnt < userInput*4) { //1����� 4���� ��ǥ�� �̷�����ִ� ������ ���ǽ����� ��
	         index++; //�ε������� �ø�
	         
	         if (index % 5 == 0) { //�ε������� 5�� ����� ���, ���� ���� ǥ�ø� ����ϰ� ���� �ݺ����� continue
	            ans += " | ";
	            continue;
	         }   else if (index % 21 == 0) { //�ε������� 21��°�� ���, 1���� ������ ���� ���� ǥ�ø� �ϳ� �� �߰� �� �ٹٲ�
	            ans += "|\n";
	            index = 0; //�ε����� �ٽ� 0���� ����
	            continue;
	         }
	                     
	         ranNum = (int)(Math.random()*8)+1; //���� ���� (1~8)
	         
	         switch(ranNum) {
	            case 1 : note = "��";
	            break;
	            case 2 : note = "��";
	            break;
	            case 3 : note = "��";
	            break;
	            case 4 : note = "��";
	            break;
	            case 5 : note = "��";
	            break;
	            case 6 : note = "��";
	            break;
	            case 7 : note = "��";
	            break;
	            case 8 : note = "��'";
	            break;
	         } //random note ����
	         
	         ans += note; //String ���信 �߰���
	         cnt++; //�ݺ� cnt ������Ŵ
	      }
	      
	      if (ans.charAt(ans.length()-1) != '|') { //ans�� �������� ||�� ������ ���� ��� �߰�����
	         ans += " | |";
	      }
	      
	      System.out.println(ans); //����Ʈ��      
	   }
}
   
		

		
	


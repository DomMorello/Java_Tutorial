import java.util.Scanner;

public class MultiArrQuiz {
	//����ܾ �����ְ� �ѱ���� ����ܾ ���ߴ� ���α׷�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "����"},	
				{"computer", "��ǻ��"},	
				{"integer", "����"},	
		};
		
		Scanner scanner = new Scanner(System.in);
		
		//�迭�� 1���� �ִ� ����ܾ���� ���ʴ�� �����ָ鼭 �ѱ���� �������� ������
		for(int i=0; i < words.length; i++) {
			System.out.printf("Q%d. %s in Korean?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();	//������ �Է°����� ����
			
			if(tmp.equals(words[i][1])) {	//�Է¹��� ���� �迭�� ����ܾ�� ��ġ�ϴ��� �˻�
				System.out.printf("correct.%n%n");
			}else {
				System.out.printf("wrong. the answer is %s.%n%n", words[i][1]);
			}
		}
		
		
	}

}

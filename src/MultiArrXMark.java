import java.util.Scanner;


public class MultiArrXMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int SIZE = 10;	//
//		int x = 0, y =0;
//		
//		char[][] board = new char[SIZE][SIZE];
//		byte[][] shipBoard = {
//				{0, 0, 0, 0, 0, 0, 1, 0, 0},
//				{1, 1, 1, 1, 0, 0, 1, 0, 0},
//				{0, 0, 0, 0, 0, 0 ,1, 0, 0},
//				{0, 0, 0, 0, 0, 0 ,1, 0, 0},
//				{0, 0, 0, 0, 0, 0 ,0, 0, 0},
//				{1, 1, 0, 1, 0, 0 ,0, 0, 0},
//				{0, 0, 0, 1, 0, 0 ,0, 0, 0},
//				{0, 0, 0, 1, 0, 0 ,0, 0, 0},
//				{0, 0, 0, 0, 0, 1 ,1, 1, 0},
//		};
//		
//		for(int i = 1; i < SIZE; i++) {
//			board[0][i] = board[i][0] = (char)(i+'0');	//�迭 board�� ��� �� ��ȣ�� �Է�
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.printf("input coordinate.(exit: 00)->");
//			String input = scanner.nextLine();
//			
//			if(input.length() == 2) {	//�� ���ڸ� �Է��� ���
//				x = input.charAt(0) - '0';	//���ڸ� ���ڷ� ��ȯ
// 				y = input.charAt(1) - '0';
//				
//				if(x == 0 && y == 0) 
//					break;
//			}
//			
//			if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
//				System.out.println("wrong input. try again");
//				continue;
//			}
//			
//			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O': 'X';
//			
//			//�迭 board�� ������ �����
//			for(int i=0; i < SIZE; i++) {
//				System.out.println(board[i]);	//board[i]�� 1���� �迭
//			}System.out.println();
//		}
		
		/*
		 * char 2���� �迭�� ��� ������ ���� for���� �̿��ؼ� �� ��Ҹ� �� ����ؾ� ������
		 * println �޼���� 1���� char�迭�� ���������� ����ϸ�, �迭�� ��� ��Ҹ� �� �ٷ� ����Ѵ�.
		 * char �迭�� ��츸 �����ϴ�. 
		char[][] ch = {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}
		};
		
		for(int i=0; i < ch.length; i++ ) {
			System.out.println(ch[i]);
		}
		*/
		
		int[] ch = {'1','2','3','4','5'};
		System.out.println(ch);
	}
}

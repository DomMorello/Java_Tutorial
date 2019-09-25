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
//			board[0][i] = board[i][0] = (char)(i+'0');	//배열 board의 행과 열 번호를 입력
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.printf("input coordinate.(exit: 00)->");
//			String input = scanner.nextLine();
//			
//			if(input.length() == 2) {	//두 글자를 입력한 경우
//				x = input.charAt(0) - '0';	//문자를 숫자로 변환
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
//			//배열 board의 내용을 출력함
//			for(int i=0; i < SIZE; i++) {
//				System.out.println(board[i]);	//board[i]는 1차원 배열
//			}System.out.println();
//		}
		
		/*
		 * char 2차원 배열의 경우 원래는 이중 for문을 이용해서 각 요소를 다 출력해야 하지만
		 * println 메서드로 1차원 char배열의 참조변수를 출력하면, 배열의 모든 요소를 한 줄로 출력한다.
		 * char 배열인 경우만 가능하다. 
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

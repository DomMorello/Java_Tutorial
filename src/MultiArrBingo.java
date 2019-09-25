import java.util.Scanner;

public class MultiArrBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;	//배열의 가로 세로 크기가 5
		int x = 0, y = 0, num = 0;	//x축, y축 좌표, 입력값 num 선언
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		//2차원 배열에 1,2,3,4,5,6 ... 식으로 값을 초기화
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		//배열에 저장된 값들을 섞음
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE); //x, y에 랜덤값을 대입
				
				//임의의 값과 원래의 값을 교환하여 대입
				int tmp = bingo[i][j]; 	
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0; i < SIZE; i++) {
				for(int j=0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d input number.(exit: 0)", SIZE*SIZE);
			String tmp = scanner.nextLine(); //입력값을 tmp에 저장
			num = Integer.parseInt(tmp);	//입력값을 정수형으로 변환
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0으로 저장
			outer:
				for(int i=0; i < SIZE; i++) {
					for(int j=0; j < SIZE; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
				}
		}while(num != 0);	//0을 입력하면 반복문을 벗어나게 했기 때문
	}

}

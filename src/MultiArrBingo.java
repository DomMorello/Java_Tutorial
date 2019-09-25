import java.util.Scanner;

public class MultiArrBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;	//�迭�� ���� ���� ũ�Ⱑ 5
		int x = 0, y = 0, num = 0;	//x��, y�� ��ǥ, �Է°� num ����
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		//2���� �迭�� 1,2,3,4,5,6 ... ������ ���� �ʱ�ȭ
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		//�迭�� ����� ������ ����
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE); //x, y�� �������� ����
				
				//������ ���� ������ ���� ��ȯ�Ͽ� ����
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
			String tmp = scanner.nextLine(); //�Է°��� tmp�� ����
			num = Integer.parseInt(tmp);	//�Է°��� ���������� ��ȯ
			
			//�Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0���� ����
			outer:
				for(int i=0; i < SIZE; i++) {
					for(int j=0; j < SIZE; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
				}
		}while(num != 0);	//0�� �Է��ϸ� �ݺ����� ����� �߱� ����
	}

}

import java.util.Scanner;

public class MultiArrQuiz {
	//영어단어를 보여주고 한국어로 영어단어를 맞추는 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "의자"},	
				{"computer", "컴퓨터"},	
				{"integer", "정수"},	
		};
		
		Scanner scanner = new Scanner(System.in);
		
		//배열의 1열에 있는 영어단어들을 차례대로 보여주면서 한국어로 무엇인지 질문함
		for(int i=0; i < words.length; i++) {
			System.out.printf("Q%d. %s in Korean?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();	//정답을 입력값으로 받음
			
			if(tmp.equals(words[i][1])) {	//입력받은 값이 배열의 영어단어와 일치하는지 검사
				System.out.printf("correct.%n%n");
			}else {
				System.out.printf("wrong. the answer is %s.%n%n", words[i][1]);
			}
		}
		
		
	}

}

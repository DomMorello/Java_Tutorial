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
		case 1 : System.out.println("도");
		break;
		case 2 : System.out.println("레");
		break;
		case 3 : System.out.println("미");
		break;
		case 4 : System.out.println("파");
		break;
		case 5 : System.out.println("솔");
		break;
		case 6 : System.out.println("라");
		break;
		case 7 : System.out.println("시");
		break;
		case 8 : System.out.println("도\'");
		break;
		}
	}
		int input = sc.nextInt();
		noteMaker(input);
	}
	
	public static void noteMaker(int userInput) { //2번 문제 메소드
	      int cnt = 0; //반복문을 몇 번 도는지 count하는 변수
	      int index = 0; //1줄이 4마디로 이루어져있음을 구분하기 위한 index 변수
	      int ranNum = 0; //난수(도~도') 생성을 위한 변수
	      String note = "";
	      String ans = "";      
	      
	      System.out.println("===========계이름 출력 프로그램===========");
	      System.out.println("마디 수 입력 : " + userInput +"\n");
	      
	      while(cnt < userInput*4) { //1마디당 4개의 음표로 이루어져있는 범위를 조건식으로 함
	         index++; //인덱스값을 올림
	         
	         if (index % 5 == 0) { //인덱스값이 5의 배수인 경우, 마디 구분 표시를 출력하고 다음 반복으로 continue
	            ans += " | ";
	            continue;
	         }   else if (index % 21 == 0) { //인덱스값이 21번째일 경우, 1줄의 끝으로 마디 구분 표시를 하나 더 추가 후 줄바꿈
	            ans += "|\n";
	            index = 0; //인덱스를 다시 0으로 내림
	            continue;
	         }
	                     
	         ranNum = (int)(Math.random()*8)+1; //난수 생성 (1~8)
	         
	         switch(ranNum) {
	            case 1 : note = "도";
	            break;
	            case 2 : note = "레";
	            break;
	            case 3 : note = "미";
	            break;
	            case 4 : note = "파";
	            break;
	            case 5 : note = "솔";
	            break;
	            case 6 : note = "라";
	            break;
	            case 7 : note = "시";
	            break;
	            case 8 : note = "도'";
	            break;
	         } //random note 생성
	         
	         ans += note; //String 정답에 추가함
	         cnt++; //반복 cnt 증가시킴
	      }
	      
	      if (ans.charAt(ans.length()-1) != '|') { //ans의 마지막이 ||로 끝나지 않을 경우 추가해줌
	         ans += " | |";
	      }
	      
	      System.out.println(ans); //프린트함      
	   }
}
   
		

		
	


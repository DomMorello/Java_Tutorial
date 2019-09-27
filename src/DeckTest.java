//상속과 포함을 공부하기 위해 작성한 예제

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
	}
}

class Deck{
	final int CARD_NUM = 52;	//카드 한 벌은 52장이므로 상수로 선언
	Card cardArr[] = new Card[CARD_NUM];
	// Card객체 배열은 참조변수 배열이고, 이 배열에 실제로 저장된 것은 객체가 아니라 객체의 주소다. 
	 
	Deck() {
		int i = 0; 
		
		//카드를 4321 스페이드 다이아몬드 하트 클로버 순으로 그 안에서 각각 13개의 카드를 1~13까지로 초기화
		for(int k=Card.KIND_MAX; k > 0; k--) {
			for(int n=0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];	//매개변수로 넣는 값의 위치에 있는 요소를 반환
	}
	
	//무작위의 인덱스를 받아서 그 위치에 있는 요소를 반환
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);	//위의 메소드를 호출
	}
	
	//무작위로 추출한 인덱스와 0,1,2,...,51까지의 요소를 섞음
	void shuffle() {
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
		
		Card temp = cardArr[i];
		cardArr[i] = cardArr[r];
		cardArr[r] = temp;
		}
	}
}

class Card{
	static final int KIND_MAX = 4;	//카드 무늬의 수 4가지
	static final int NUM_MAX = 13;	//무늬별 카드의 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;	//카드 무늬의 종류
	int number;	//카드에 적힌 숫자
	
	Card(){
		this(SPADE, 1);	//같은 클래스의 다른 생성자를 호출
	}
	
	//객체 생성시 매개변수로 kind와 number를 받아서 변수를 초기화함
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";	//숫자 10은 X로 표현
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
		//kind: 객체 생성시 받은 int kind 매개변수 위치의 요소를 반환, number: 객체 생성시 받은 int number 매개변수 위치의 요소를 반환
	}
}
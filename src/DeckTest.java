//��Ӱ� ������ �����ϱ� ���� �ۼ��� ����

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
	final int CARD_NUM = 52;	//ī�� �� ���� 52���̹Ƿ� ����� ����
	Card cardArr[] = new Card[CARD_NUM];
	// Card��ü �迭�� �������� �迭�̰�, �� �迭�� ������ ����� ���� ��ü�� �ƴ϶� ��ü�� �ּҴ�. 
	 
	Deck() {
		int i = 0; 
		
		//ī�带 4321 �����̵� ���̾Ƹ�� ��Ʈ Ŭ�ι� ������ �� �ȿ��� ���� 13���� ī�带 1~13������ �ʱ�ȭ
		for(int k=Card.KIND_MAX; k > 0; k--) {
			for(int n=0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];	//�Ű������� �ִ� ���� ��ġ�� �ִ� ��Ҹ� ��ȯ
	}
	
	//�������� �ε����� �޾Ƽ� �� ��ġ�� �ִ� ��Ҹ� ��ȯ
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);	//���� �޼ҵ带 ȣ��
	}
	
	//�������� ������ �ε����� 0,1,2,...,51������ ��Ҹ� ����
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
	static final int KIND_MAX = 4;	//ī�� ������ �� 4����
	static final int NUM_MAX = 13;	//���̺� ī���� ��
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;	//ī�� ������ ����
	int number;	//ī�忡 ���� ����
	
	Card(){
		this(SPADE, 1);	//���� Ŭ������ �ٸ� �����ڸ� ȣ��
	}
	
	//��ü ������ �Ű������� kind�� number�� �޾Ƽ� ������ �ʱ�ȭ��
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";	//���� 10�� X�� ǥ��
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
		//kind: ��ü ������ ���� int kind �Ű����� ��ġ�� ��Ҹ� ��ȯ, number: ��ü ������ ���� int number �Ű����� ��ġ�� ��Ҹ� ��ȯ
	}
}
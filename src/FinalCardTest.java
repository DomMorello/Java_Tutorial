class Card1{
	final int NUMBER;	//������� ����� ���ÿ� �ʱ�ȭ ���� �ʰ� �Ʒ��� �����ڸ� ���� �� ���� �ʱ�ȭ �� �� ����
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		KIND = kind;
		NUMBER = num;	//�� �����ڸ� ���ؼ� final ����� �ʱ�ȭ��
	}
	
	Card1(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card1 c = new Card1("HEART", 10);
//		c.NUMBER = 5;	--> final ����̱� ������ ���� ������ �� ����
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);	//System.out.println(c.toSrting()); �� ����
	}

}


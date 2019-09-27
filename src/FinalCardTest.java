class Card1{
	final int NUMBER;	//상수지만 선언과 동시에 초기화 하지 않고 아래서 생성자를 통해 한 번만 초기화 할 수 있음
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		KIND = kind;
		NUMBER = num;	//이 생성자를 통해서 final 상수를 초기화함
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
//		c.NUMBER = 5;	--> final 상수이기 때문에 값을 변경할 수 없음
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);	//System.out.println(c.toSrting()); 와 같음
	}

}


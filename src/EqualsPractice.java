
public class EqualsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {	//false --> equals메서드는 주소값을 비교함. 
			System.out.println("v1, v2 same");
		}else {
			System.out.println("v1, v2 different");
		}
		
		v2 = v1;	//v2는 v1이 참조하고 있는 인스턴스의 주소값이 저장되므로 v2도 v1과 같은 주소값을 갖는다.
		
		if(v1.equals(v2)) {	//true
			System.out.println("v1, v2 same");
		}else {
			System.out.println("v1, v2 different");
		}
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}

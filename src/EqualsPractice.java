
public class EqualsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {	//false --> equals�޼���� �ּҰ��� ����. 
			System.out.println("v1, v2 same");
		}else {
			System.out.println("v1, v2 different");
		}
		
		v2 = v1;	//v2�� v1�� �����ϰ� �ִ� �ν��Ͻ��� �ּҰ��� ����ǹǷ� v2�� v1�� ���� �ּҰ��� ���´�.
		
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

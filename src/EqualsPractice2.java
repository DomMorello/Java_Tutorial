
public class EqualsPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) {
			System.out.println("p1, p2 same person");
		}else {
			System.out.println("p1, p2 not same person");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1, p2 same person");
		}else {
			System.out.println("p1, p2 not same person");
		}
	}

}

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;	//obj가  Object타입이므로 id값을 참조하기 위해서는 Person 타입으로 형변환이 필요함.
		}else {
			return false;
		}
	}
	
	Person(long id){
		this.id = id;
	}
}

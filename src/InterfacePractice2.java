
public class InterfacePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}

}

interface Repairable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {	//여기서  r은 Repairable 타입이기 떄문에 인터페이스 Repairable에 정의된 맴버만 사용할 수 있다.
		if(r instanceof Unit) {	//그래서 타입을 체크한 후 캐스팅하여 Unit클래스에 정의된 hitPoint와 MAX_HP를 사용할 수 있도록 하였다.
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				/* Unit의  hp를 증가시킨다 */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "'s repair is completed.");
		}
	}
}
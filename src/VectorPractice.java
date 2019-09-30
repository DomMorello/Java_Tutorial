import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer1 b = new Buyer1();
		Tv1 tv = new Tv1();
		Computer1 com = new Computer1();
		Audio1 audio = new Audio1();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
	}

}

class Product1{
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product1(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv1 extends Product1{
	Tv1(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer1 extends Product1{
	Computer1(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio1 extends Product1{
	Audio1(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("lack of money");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println("u bought a "+p);
	}
	
	void refund(Product1 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("u refund the " + p);
		}else {
			System.out.println("u don't have the product");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("u don't have any products.");
			return;
		}
		
		for(int i=0; i < item.size(); i++) {
			Product1 p = (Product1)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("total expenses :" + sum);
		System.out.println("item list :" + itemList);
		
	}
}

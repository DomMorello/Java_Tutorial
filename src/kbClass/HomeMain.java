package kbClass;

public class HomeMain {
	public static void main(String[] args) {
		MyMovie savingPrivateRyan = new MyMovie("라이언 일병 구하기","1994","3회","600$","톰행크스","이동현");
		MyMovie jinhong82 = new MyMovie("82년생 박진홍","박진홍","이동현");
		MyMovie developer = new MyMovie("브래드 피트","크리스토퍼 놀란");
		
		savingPrivateRyan.printInfo();
		jinhong82.printInfo();
		developer.printInfo();
	}
}

class MyMovie{
	String name = "미상";
	String release = "미상";
	String nominee = "수상 내역 없음";
	String cost = "미상";
	String mainChar = "미상";
	String producer = "미상";
	
	public MyMovie(String name, String release, String nominee, String cost, String mainChar, String producer) {
		this.name = name;
		this.release = release;
		this.nominee =  nominee;
		this.cost = cost;
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public MyMovie(String name, String mainChar, String producer) {
		this.name = name;
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public MyMovie(String mainChar, String producer) {
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public void printInfo() {
		System.out.println("-----------정보----------");
		System.out.println("이름: "+name);
		System.out.println("개봉일자: "+release);
		System.out.println("수상내역: "+nominee);
		System.out.println("제작비용: "+cost);
		System.out.println("주연: "+mainChar);
		System.out.println("감독: "+producer);
	}
	
}
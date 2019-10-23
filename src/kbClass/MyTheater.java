package kbClass;

import java.util.Arrays;

public class MyTheater {

	String location;
	MyMovie[] movies;
	int rooms;
	
	public MyTheater(String location) {
		movies = new MyMovie[3];
		MyMovie movie1 = new MyMovie("�����","�׼�");
		MyMovie movie2 = new MyMovie("��Ŀ","���");
		MyMovie movie3 = new MyMovie("�����Ǽ�Ʈ","��Ÿ��");
		movies[0] = movie1;
		movies[1] = movie2;
		movies[2] = movie3;
		this.location = location;
		
	}
	
	public MyTheater(int rooms) {
		this.rooms = rooms;	//�� ��ȭ������ �󿵰��� �־��� rooms��ŭ �ִ�.
		movies = new MyMovie[rooms];
	}
	
	public void printTheater() {
		System.out.println(location);
		for(int i=0; i < movies.length; i++) {
			System.out.println("["+(i+1)+"��]"+movies[i].printMovie());
		}
	}
	
	public static void main(String[] args) {
		MyTheater theater1 = new MyTheater("�սʸ�CGV");
		theater1.printTheater();
		
	}
}

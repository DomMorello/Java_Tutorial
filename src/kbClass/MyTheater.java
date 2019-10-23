package kbClass;

import java.util.Arrays;

public class MyTheater {

	String location;
	MyMovie[] movies;
	int rooms;
	
	public MyTheater(String location) {
		movies = new MyMovie[3];
		MyMovie movie1 = new MyMovie("어벤져스","액션");
		MyMovie movie2 = new MyMovie("조커","드라마");
		MyMovie movie3 = new MyMovie("말레피센트","판타지");
		movies[0] = movie1;
		movies[1] = movie2;
		movies[2] = movie3;
		this.location = location;
		
	}
	
	public MyTheater(int rooms) {
		this.rooms = rooms;	//이 영화관에는 상영관이 주어진 rooms만큼 있다.
		movies = new MyMovie[rooms];
	}
	
	public void printTheater() {
		System.out.println(location);
		for(int i=0; i < movies.length; i++) {
			System.out.println("["+(i+1)+"관]"+movies[i].printMovie());
		}
	}
	
	public static void main(String[] args) {
		MyTheater theater1 = new MyTheater("왕십리CGV");
		theater1.printTheater();
		
	}
}

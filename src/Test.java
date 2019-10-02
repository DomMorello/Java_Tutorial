import java.util.Scanner;

public class Test {
	public static int myRound(double d) {
		String input = d + "";
		char dist = input.charAt(2);
		int result = dist - '0';
		
		if(result > 4) {
			return (int)d + 1;
		}else {
			return (int)d;
		}
		
	}
	
	public static int myFloor(double d) {
		return (int)d;
	}
	
	public static int myCeil(double d) {
		double result = d - (int)d;
		
		if(result > 0) {
			return (int)d + 1;
		}else {
			return (int)d;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.printf("myRound(3.141592) = %d%n", myRound(3.141592));
		System.out.printf("myRound(3.141592) = %d%n", myRound(5.50));
		System.out.printf("myRound(3.141592) = %d%n", myRound(3.99));
		System.out.println();
		System.out.printf("myFloor(3.141592) = %d%n", myFloor(3.141592));
		System.out.printf("myFloor(3.141592) = %d%n", myFloor(5.50));
		System.out.printf("myFloor(3.141592) = %d%n", myFloor(3.99));
		System.out.println();
		System.out.printf("myCeil(3.141592) = %d%n", myCeil(3.141592));
		System.out.printf("myCeil(3.141592) = %d%n", myCeil(5.50));
		System.out.printf("myCeil(3.141592) = %d%n", myCeil(3.99));
		System.out.println("======================");
		System.out.printf("myRound(·£´ý°ª) = %d%n", myRound(Math.random()*10));
		System.out.printf("myFloor(·£´ý°ª) = %d%n", myFloor(Math.random()*10));
		System.out.printf("myCeil(3.00) = %d%n", myCeil(3.00));
		
	}
}

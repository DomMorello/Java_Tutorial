import java.util.Scanner;

public class Test {
	final static int DATA_RATIO = 1024;
	
	public static double mbTokb(double input) {
		return input * DATA_RATIO;
	}
	
	public static double mbTogb(double input) {
		return input / DATA_RATIO;
	}
	
	public static double mbTotb(double input) {
		return input / Math.pow(DATA_RATIO, 2);
	}
	
	public static double mbTofb(double input) {
		return input / Math.pow(DATA_RATIO, 3);
	}
	
	public static double mbToeb(double input) {
		return input / Math.pow(DATA_RATIO, 4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scanner = new Scanner(System.in);
		System.out.println("변환할 메가바이트 단위를 입력하시오.");
		double input = scanner.nextDouble();
		
		System.out.println("킬로바이트: " + mbTokb(input) +" KB");
		System.out.println("기가바이트: " + mbTogb(input) +" GB");
		System.out.println("테라바이트: " + mbTotb(input) +" TB");
		System.out.println("페타바이트: " + mbTofb(input) +" FB");
		System.out.println("엑사바이트: " + mbToeb(input) +" EB");
		
	}
}

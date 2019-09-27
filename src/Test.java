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
		System.out.println("��ȯ�� �ް�����Ʈ ������ �Է��Ͻÿ�.");
		double input = scanner.nextDouble();
		
		System.out.println("ų�ι���Ʈ: " + mbTokb(input) +" KB");
		System.out.println("�Ⱑ����Ʈ: " + mbTogb(input) +" GB");
		System.out.println("�׶����Ʈ: " + mbTotb(input) +" TB");
		System.out.println("��Ÿ����Ʈ: " + mbTofb(input) +" FB");
		System.out.println("�������Ʈ: " + mbToeb(input) +" EB");
		
	}
}

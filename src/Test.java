public class Test {
	public static void main(String[] args) {
		
		String name = "����";
		int korean = (int)(Math.random()*100) + 1;
		int english = (int)(Math.random()*100) + 1;
		int math = (int)(Math.random()*100) + 1;
		String koName = "����";
		String enName = "����";
		String maName = "����";
		
		int sum = korean + english + math;
		double average = sum / 3;
		
		
		System.out.println("==== ���� ��� ����ǥ ====");
		System.out.printf("�̸�: %s��%n", name);
		System.out.printf("%s: %d��%n", koName, korean);
		System.out.printf("%s: %d��%n", enName, english);
		System.out.printf("%s: %d��%n", maName, math);
		System.out.println("--------------------");
		System.out.printf("����: %d%n", sum);
		System.out.printf("���: %f%n", average);
		System.out.println("--------------------");
		System.out.println("���: <<<" +rank(average)+ ">>>");
		System.out.println("����üũ: " + koCheck(korean, koName) + enCheck(english, enName) + maCheck(math, maName) + fileCheck(korean, english, math));
	}
	
	public static String rank(double average) {
		if(average > 90)
			return "A";
		else if(average > 70)
			return "B";
		else if(average > 60)
			return "C";
		else if(average > 40)
			return "D";
		else return "���հ�"; 
	}
	
	public static String fileCheck(int korean, int english, int math) {
		if(korean <= 40 || english <= 40 || math <= 40) {
			return "�������� ���հ�";
		}else 
			return "�հ�";
	}
	
	public static String koCheck(int korean, String koName) {
		if(korean <= 40)
			return "���� ";
		else
			return "";
	}
	
	public static String enCheck(int english, String enName) {
		if(english <= 40)
			return "���� ";
		else
			return "";
	}
	
	public static String maCheck(int math, String maName) {
		if(math <= 40)
			return "���� ";
		else
			return "";
	}
	

}


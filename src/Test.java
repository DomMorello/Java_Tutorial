public class Test {
	public static void main(String[] args) {
		
		String name = "동현";
		int korean = (int)(Math.random()*100) + 1;
		int english = (int)(Math.random()*100) + 1;
		int math = (int)(Math.random()*100) + 1;
		String koName = "국어";
		String enName = "영어";
		String maName = "수학";
		
		int sum = korean + english + math;
		double average = sum / 3;
		
		
		System.out.println("==== 성적 등급 판정표 ====");
		System.out.printf("이름: %s씨%n", name);
		System.out.printf("%s: %d점%n", koName, korean);
		System.out.printf("%s: %d점%n", enName, english);
		System.out.printf("%s: %d점%n", maName, math);
		System.out.println("--------------------");
		System.out.printf("총점: %d%n", sum);
		System.out.printf("평균: %f%n", average);
		System.out.println("--------------------");
		System.out.println("등급: <<<" +rank(average)+ ">>>");
		System.out.println("과락체크: " + koCheck(korean, koName) + enCheck(english, enName) + maCheck(math, maName) + fileCheck(korean, english, math));
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
		else return "불합격"; 
	}
	
	public static String fileCheck(int korean, int english, int math) {
		if(korean <= 40 || english <= 40 || math <= 40) {
			return "과락으로 불합격";
		}else 
			return "합격";
	}
	
	public static String koCheck(int korean, String koName) {
		if(korean <= 40)
			return "국어 ";
		else
			return "";
	}
	
	public static String enCheck(int english, String enName) {
		if(english <= 40)
			return "영어 ";
		else
			return "";
	}
	
	public static String maCheck(int math, String maName) {
		if(math <= 40)
			return "수학 ";
		else
			return "";
	}
	

}


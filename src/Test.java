import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 100) {
			int ranNum = (int)(Math.random()*1000 + 1);
			System.out.println(i +"ȸ�� ���� " + ranNum + " ���� => " +numDecider(ranNum));
			
			i++;
		}
	}
	
	public static String numDecider(int ranNum) {
		if(ranNum % 2 == 0)
			return "¦��";
		else
			return "Ȧ��";
	}
}


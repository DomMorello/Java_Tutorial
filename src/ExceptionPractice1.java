
public class ExceptionPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception e = new Exception("intentionally made");
			throw e; //���ܸ� �߻���Ŵ
//			throw new Exception("intentionally made");	���� �� ���� �� �ٷ� �� �� ����
		} catch(Exception e) {
			System.out.println("Error message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("the program is normally finished");
	}

}

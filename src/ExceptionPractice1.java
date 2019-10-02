
public class ExceptionPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception e = new Exception("intentionally made");
			throw e; //예외를 발생시킴
//			throw new Exception("intentionally made");	위의 두 줄을 한 줄로 쓸 수 있음
		} catch(Exception e) {
			System.out.println("Error message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("the program is normally finished");
	}

}

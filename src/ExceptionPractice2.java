import java.io.File;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "is successfully made.");
		}catch(Exception e) {
			System.out.println(e.getMessage() + "please rewrite the name of the file");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("the name of the file is not valid");
		File f = new File(fileName);	//File객체를 생성
		//File객체의 createNewFile메서드를 이용해서 실제 파일을 생성
		f.createNewFile();
		return f;	//생성된 객체의 참조를 반환한다.
	}

}



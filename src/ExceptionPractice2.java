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
		File f = new File(fileName);	//File��ü�� ����
		//File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ ����
		f.createNewFile();
		return f;	//������ ��ü�� ������ ��ȯ�Ѵ�.
	}

}




public class ExceptionPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			startInstall();	//���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();	//���� ����
		}catch(SpaceException e){
			System.out.println("error message: " + e.getMessage());
			e.printStackTrace();
			System.out.println("plz reinstall after securing space");
		}catch(MemoryException me) {
			System.out.println("error message: " + me.getMessage());
			me.printStackTrace();
			System.gc();	//������ �÷��ͷ� �޸𸮸� �÷���
			System.out.println("install again");
		}finally {
			deleteTempFiles();
		}
		
	}

	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("lack of memory to install");
		if(!enoughMemory())
			throw new MemoryException("lack of memory");
	}
	
	static void copyFiles() {/*copy file*/}
	static void deleteTempFiles() {/*delete temp files*/}
	static boolean enoughSpace() {
		//code to confirm whether there is enough space to install
		return false;
	}
	
	static boolean enoughMemory() {
		//code to confirm whether there is enough memory to install
		return true;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
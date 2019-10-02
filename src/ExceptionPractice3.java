
public class ExceptionPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);	//예외가 발생하지 않는다.
		}catch(WorkException e){
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);	//예외가 발생한다.
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
	}

}

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ") is summoned");
		
		if(exception)
			throw new WorkException("WorkException is generated!!!");
	}
	
	public void close() throws CloseException{
		System.out.println("close() is summoned");
		throw new CloseException("CloseException is generated!!!");
	}
}

class WorkException extends Exception{
	WorkException(String msg){
		super(msg);
	}
}

class CloseException extends Exception{
	CloseException(String msg){
		super(msg);
	}
}
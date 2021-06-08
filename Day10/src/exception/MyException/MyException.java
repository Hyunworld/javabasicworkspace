package exception.MyException;

public class MyException extends Exception {
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}
	
	//필요한 사용자 정의 메서드....
	
	public String errorMessage() {
		return this.getMessage();
	}
	
	
}

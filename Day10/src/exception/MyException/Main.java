package exception.MyException;

public class Main {
	public static void main(String[] args) {
		
		Account acc = new Account("국민", "1234", 1000);
		
		try {
		acc.withDraw(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}

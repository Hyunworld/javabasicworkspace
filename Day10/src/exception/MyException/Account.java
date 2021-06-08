package exception.MyException;

public class Account {
	//접근제어자를 붙여주세요.
	//withDraw()에서 잔액이 출금금액보다 작다면, MyException으로 예외를 발생시키고 처리하는 코드를 작성해주세요.
	
	private String name;
	private String password;
	private int balance;
	
	public Account(String pName, String pw, int bal) {
		name = pName;
		password = pw;
		balance = bal;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withDraw(int money) throws MyException {
		if (balance < money) {
			throw new MyException((money-balance) + "가 부족");

		}
		
			balance -= money;
		}
		

		
	

	public int getBalance() {
		return balance;
	}
		

	
}

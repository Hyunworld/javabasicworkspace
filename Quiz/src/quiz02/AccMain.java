package quiz02;

public class AccMain {
	public static void main(String[] args) {
		
		Account acc = new Account("홍길동", "1234", 3000);
		
		acc.deposit(1000);
		acc.whthDraw(2000);
		
		int bal = acc.getBalance();
		System.out.println("잔액 : " +bal);
	}
	}

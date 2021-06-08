package quiz02;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(String pName, String pw, int bal) {
		name = pName;
		password = pw;
		balance = bal;
	}
	
	void deposit(int money) {
		balance += money;
	}
	void whthDraw(int money) {
			balance -= money;
		}
		
	int getBalance() {
		return balance;
	}
		
	
	
	
}

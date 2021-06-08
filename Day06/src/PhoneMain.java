
public class PhoneMain {
	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone any = new Phone("빨강");
		any.info();
		
		Phone red = new Phone(300000, "빨강");
		red.info();
		
		
		Phone galaxy = new Phone("갤럭시노트10+", "블랙");
		galaxy.info();
		
		
		//모든 멤버변수를 받아서 초기화 하는 생성자
		//green, 900000, 샤오미를 전달해서 객체 생성.
		
		Phone shaomi = new Phone("샤오미", "초록", 900000);
		shaomi.info();
		
		System.out.println(basic == any);
		
		Phone ex = new Phone() ;
		ex.info();
		
	}
}

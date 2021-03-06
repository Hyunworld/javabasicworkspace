package jdbc.example.step2;

public class Members {

	//Members테이블의 값을 저장하는 용도의 클래스
	//은닉된 클래스로 생성. getter, setter를 이용해서 조회
	//일반적으로 테이블명과 동일한 이름의 변수를 선언합니다.
	private String id;
	private String pw;
	private String name;
	private String email;
	
	//모든 변수를 받아서 초기화하는 생성자, 기본생성자를 만듭니다.
	public Members() {
	}

	public Members(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

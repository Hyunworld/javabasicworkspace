package encap.good;

public class Member {
	//getter, setter, 생성자 를 빨리 생성하는 밥법
	//alt + shift + s, source 탭
	private String id;
	private String pw;
	private String name;
	private char gender;
	private int birth;
	private int number;
	private String addr;
	private String zipNum;
	
	//기본생성자 ctrl + space -> enter
	
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipNum() {
		return zipNum;
	}
	public void setZipNum(String zipNum) {
		this.zipNum = zipNum;
	}
	
	
	
	
}

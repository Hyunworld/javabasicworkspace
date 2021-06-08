package encap.good;

public class MyBirth {

	private int year;
	private int month;
	private int day;
	private String ssn; //주민번호
	
	/*
	 * 은닉 변수에 접근할 때는 클래스 설계차이 미리 생성해놓은
	 * getter/setter 메서드를 사용합니다.
	 * 
	 * setter메서드
	 * 1.은닉변수의 값을 저장하는 용도
	 * 2.접근제어자는 public으로 선언하고 이름이 set + 멤버변수명으로 지정
	 */
	
	public void setYear(int year) {
		//예시로 - 1950~2021년까지
		if(year <= 1950 || year > 2021) {
			System.out.println("년도는 1950~2021만 저장됩니다");
		} else {
			
			this.year = year;
		}
	}

	
	/*
	 * getter 메서드의 선언
	 * 1. 은닉변수에 값을 조회하는 용도
	 * 2. 접근제어자는 public으로 선언하고 이름은 get + 멤버변수명으로 지정	
	 */

	
	public int getYear() {
		return year;
	}
	
	/*
	 * 1.month, day, ssn에 getter, setter 생성
	 * month - 1~12월 까지만 저장가능
	 * day - 1~31 까지ㅏㅁㄴ 저장 가능
	 * ssn - 13자리까지만 저장가능 문ㅁ자열.length() 
	 */
	
	public void setMonth(int month) {
		if(month > 12 || month < 1) {
			System.out.println("1~12만 입력 가능합니다");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("1~31만 입력 가능합니다");
		} else {
			this.day = day;
	}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if(ssn.length() > 13) {
			System.out.println("13자리까지 입력 가능합니다");
		} else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
}

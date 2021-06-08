package quiz02;

public class Person {
	String name ;
	int age ;
	int tall;
	
	
	Person(){
		
	}
	// ↑ 내가만들어야함
	
	//생성자를 프로그래머가 인위적으로 생성하면, 기본생성자를 자동으로 만들지 않습니다.
	Person(String pname, int page, int ptall) {
		name = pname;
		age = page;
		tall = ptall;
	}

	
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : " + tall);
		
		
	}
	
}

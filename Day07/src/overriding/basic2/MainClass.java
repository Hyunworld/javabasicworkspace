package overriding.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		//S, T, E 클래스에서 각각의 고유 정보가 출력될수 있도록 info() 오버라이딩 하세요.
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId = 201713759;
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "임재범";
		t.age = 40;
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name = "홍길똥";
		e.age = 50;
		e.departmet = "역사";
		System.out.println(e.info());
		
		
	}
}

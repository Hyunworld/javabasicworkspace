package poly.instanceof_;

public class MainClass {
	public static void main(String[] args) {
		
		Person hong = new Student("홍길동", 20, 123);
		Person lee = new Teacher("이승철", 40, "가수");
		Person son = new Employee("손흥민", 20, "축구");
		
		personInfo(hong);
		
	} //main 끝
	
	public static void personInfo(Person p) {
		//instanceof로 타입확인후 캐스팅
		if(p instanceof Student) {
			System.out.println("학생정보입니다");
			Student s = (Student)p;
			System.out.println(s.info());
		}else if(p instanceof Teacher) {
			System.out.println("선생 정보 입니다");
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}else if(p instanceof Employee) {
			System.out.println("직원 정보 입니다.");
			Employee e = (Employee)p;
			System.out.println(e.info());
		}else { //부모타입은 항상 마지막에 
			System.out.println("사람 정보 입니다");
			System.out.println(p.info());
		}
	}
	
	
	
	
}

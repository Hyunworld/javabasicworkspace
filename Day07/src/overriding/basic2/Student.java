package overriding.basic2;

public class Student extends Person{

	int studentId;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + "학번:" + studentId;
	}
	
	}

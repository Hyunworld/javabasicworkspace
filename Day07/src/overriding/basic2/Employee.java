package overriding.basic2;

public class Employee extends Person {

	String departmet; //부서
	
		String info() {
			return "이름:" + name + ", 나이:" + age + "부서:" + departmet;
		}
		}

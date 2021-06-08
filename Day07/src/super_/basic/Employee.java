package super_.basic;

public class Employee extends Person {

	String departmet; //부서
	
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.departmet = department;
	}
		String info() {
			return "이름:" + name + ", 나이:" + age + "부서:" + departmet;
		}
		}

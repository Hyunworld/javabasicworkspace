package encap.obj;

public class Hotel {
	//멤버변수
	
	private Employee emp;
	private Chef chef;
	
	//생성자
	public Hotel() {
		this.emp = new Employee();
		this.chef = new Chef();
	}

	//emp setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
	//chef setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	

	
	
	
	
}

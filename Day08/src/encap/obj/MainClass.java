package encap.obj;

public class MainClass{
	public static void main(String[] args) {
		
		//Hotel안에 있는 Employee의 working() 실행
		Hotel h = new Hotel();
//		Employee e = h.getEmp();
//		e.working();
		
		h.getEmp().working();
		
		//Hotel 안에 있는 Chef를 새로운 Chef로 변경
		
//		Chef c = new Chef();
//		h.setChef(c);
//		↑ 줄이면  ↓
		h.setChef(new Chef());
		
		
	}
}

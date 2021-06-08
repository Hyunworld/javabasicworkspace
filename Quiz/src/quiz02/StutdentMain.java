package quiz02;

public class StutdentMain {
	public static void main(String[] args) {
		
		Student stu = new Student("이상현",1,43,64,23);
		
		double avg = stu.getAvg();
		double sum = stu.getTotal();
		
		Student stu2 = new Student("이상민",2,88,72,95);
		double avg2 = stu2.getAvg();
		double sum2 = stu2.getTotal();
		
		System.out.println(sum + " , " + avg);
	}
}

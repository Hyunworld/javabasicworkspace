package quiz02;

public class Student {

	/*멤버변수
	 * name, no, kor, eng, math
	 * 생성자
	 * 5개 매개변수수로 받아서 초기화 하는 생성자
	 * 
	 * getTotal() - 국, 영, 수 점수를 모두 더해서 double형으로 반환
	 * getAvg() - 총점을 나눈 평균을 double형으로 반환(소수점 2자리 까지)
	 * - *100 캐스팅 / 100.0
	 * maing에서는 학생 2명을 생성
	 * 
	 */
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sno, int skor, int seng, int smath) {
		name = sName;
		no =sno;
		kor = skor;
		eng = seng;
		math =smath;
	}
	double getTotal() {
		return kor + eng + math;

	}
	
	double getAvg() {
		return (int)(getTotal() / 3 * 100) / 100.0;
	}
	
	
	
}

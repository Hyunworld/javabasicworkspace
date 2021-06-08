
public class IfEx01 {
	public static void main(String[] args) {
		
		//0~100 점수를 생성
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수 : " + point);
		
		if(point >= 60) {
			System.out.println("축하합니다");
			System.out.println("합격이네요");
		} else {
			System.out.println("불합격 입니다");
		}
		
		
	}
}

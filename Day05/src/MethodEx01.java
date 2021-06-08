
public class MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 1, 매서드(함수)는 내부에 선언할 수 없습니다.
		 */
		
		System.out.println("1~10까지 합:" + calSum());
		System.out.println("1~10까지 합 :" + calSum());
		
		int result = calSum();
		
		String result2 = strPlus();
		System.out.println(result2);
		}//end main
	
	static int calSum() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	
	static String strPlus() {
		
		String str = "";
		for(char c = 'A'; c<='Z' ; c++) {
			str += c;
		}
		
		return str;
	}
	
	String randomStr() {
		
		double d = Math.random();
		
		String s = "";
		if(d <= 0.3) {
			s = "가위";
		} else if (d <= 0.6) {
			s = "바위";
		}else {
			s = "보";
		}
		
		return null;
	}
	
}

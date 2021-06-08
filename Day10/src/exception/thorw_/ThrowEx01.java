package exception.thorw_;

public class ThrowEx01 {
	public static void main(String[] args) {
		/*
		 * 예외 만들기
		 * 메서드, 새애성자에서 실생도중 throw키워드를 만나면 즉시 예외를 만들고, 예외처리구문을 찾습니다.
		 * 
		 * 예외가 만들어지면 코드가 즉시 중단되고 가까이 있는 예외처리 구문으로 이동하게 됩니다.(catch)
		 * 
		 */
		try {
		System.out.println("결과:" + calsum(10));
		System.out.println("결과" + calsum(-4));
		} catch (Exception e) {
//			System.out.println("반드시 양수로 전달해야 합니다");
//			System.out.println(e.getMessage());//예외 발생시 전달한 예외 메시지를 얻어오는 기능
			e.printStackTrace(); //예외의 경로를 추적하는 메시지를 출력해줍니다.(예외 원인을 찾을 때 매번 사용 합니다)
		}
	}
	//매개값을 받아서 합계를 리턴하는 메서드
	public static int calsum(int a) throws Exception {
		
		if (a<0) {
			throw new Exception();
		}
		int sum = 0;
		for(int i = 1; i<=a ; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
}

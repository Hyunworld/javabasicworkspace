package exception.throws_;

public class ThrowsEx02 {

	public ThrowsEx02() {
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
	
	public void aaa(int num) throws Exception{
		System.out.println("aaa호출");
//		try {
//		System.out.println(10/num);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		System.out.println("aaa종료");
//	}
		System.out.println(10 / num);
		System.out.println("aaa종료");
	}
	
	public void bbb() {
		System.out.println("bbb호출");
		try {
		aaa(0);
		} catch (Exception e) {
			
			System.out.println("bbb종료");
		}
	}
	
	
}

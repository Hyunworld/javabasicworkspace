package Quiz16;

public class strQuiz04 {
	public static void main(String[] args) {
		/*
		 * palindrome함수는 매개변수로 String을 받아서 회문 여부를 검사하는 메서드입니다.
		 * 회문 : 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장
		 * ex) 다시 합창 합시다, 다시다, 다 같은 것은 같다
		 * 
		 * 문장은 공백을 포함해서 매개값을 받아도 됩니다.
		 * 회문이라면 "회문" 아니라면 "회문이 아닙니다"를 리턴합니다.
		 * 
		 * 9번째로 푸는사람 상품
		 * 
		 */

	}
	
//	public static void Palindrome(String a) {
		
//		String b = a.replace(" ","");
//		
//		for(int i = 0; i < b.length(); i++) {
//			if(b.charAt(i) != b.charAt(b.length()-i-1)) {
//				System.out.println("회문이 아닙니다");
//				break;
//				
//			} else {
//				if(b.length()/2 == i) {
//					System.out.println("회문");
//				}
//			}
//			} 
//		
//		}
	
	
	public static String Palindrome(String a) {
		
	a = a.replace(" ", "");
	StringBuffer sb = new StringBuffer(a);
	return sb.reverse().toString().equals(a) ? "회문" : "회문x";



	}
		
		
	}

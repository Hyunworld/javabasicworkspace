
public class TextEx {

	public static void main(String[] args) {
		
		//단일문자를 저장하는 데이터타입 char
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		//문자를 통일하기 위해서 유니코드 등장 => 크기를 2byte로 지정, 부호없는형태의 65536개의 글자 표현
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; //유니코드를 표현하는 탈출문자
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c3 + "" + c4 + "" + c5);
		
		System.out.println("-------------------------------------");
		
		String s1 = "hello ";
		String s2 = "world";
		
		System.out.println(s1 + s2);
		System.out.println("문자열의길이:" + s1.length() );
		
		System.out.println("-------------------------------------");
		//문자열의 연산 (+)
		System.out.println(100 + 200);
		System.out.println("100" + 200); //문자열이 다른타입에 붙으면 결과는 항상 문자열
		System.out.println(100 + 200 + "hello");
		
		System.out.println("hello" + 100 + 200);
		
		
		System.out.println('A' + 10); //75
		System.out.println("A" + 10); //A10
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

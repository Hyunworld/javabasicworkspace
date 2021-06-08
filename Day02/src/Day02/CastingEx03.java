package Day02;

public class CastingEx03 {
	
	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서 큰 타입 맞추어 자동 형변환 됩니다.
		char cc = (char)(c + i);
		int ii = c + i;
		
		System.out.println(cc);
		System.out.println('A' + 2);
		System.out.println(ii);
		
		int j = 10;
		double d = 3.14;
		double dd = j + d;
		
		System.out.println(j + d);
		
		//1. 서로 다른 타입의 연산에서 큰 타입 맞추어 자동 형변환 됩니다.
		byte b1 = 100;
		byte b2 = 12;
		
		byte b3 = (byte)(b1 + b2);
		
		byte b4 = 10;
		short s1 = 100;
		
		short ss = (short) (b4 + s1);
		
		
	}
}

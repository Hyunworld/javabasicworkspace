
public class BreakEx03 {
	public static void main(String[] args) {
		
		//중첩 반복문의 탈출
		
		boolean flag = false; //탈출을 위한 변수
		
		for(char u = 'A' ; u <= 'Z' ; u++) {
			
			for (char l = 'a' ; l <= 'z' ; l++) 
			{
				System.out.println(u + "-" + l);
				if(l == 'c') {
					flag = true;
					break;
				}	
			}//inner for
			if(flag) break;
		}//outer for
		
		
		
		//탈출할 반복문에 이름을 붙이고 break 뒤에 이름을 붙여 탈출하는 방법
		es : for(char u = 'A' ; u <= 'Z' ; u++) {
				for(char l = 'a' ; l <= 'z' ; l++) {
				System.out.println(u + "-" + l);
				if (l =='c') break es;
			}
		}
		
		
		
		
		
		
	}
}

package basic;

public class Quiz03 {

		public static void main(String[] args) {
			
			//-10~10까지의 랜덤수를 만들고, 이 랜덤한 값이 0인지, 양수, 음수 인지 판별
			//조건 - ifelse 쓰지 않습니다. (3항연산식을 중첩으로)
			
			int r = (int)(Math.random()*21) - 10;
			System.out.println(r>0 ? "양수" : r<0 ? "음수" : "0");

		}
}

package Day02;
import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성 - 생성시에 크기를 지정
		arr = new int[5];
		System.out.println(arr);
		
		//3.배열의 초기화 (값을 지정하는 과정)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 34;
		arr[4] = 50;
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 값 : " + arr[2]);
		arr[2] = 1000;
		System.out.println("배열의 3번째 값 : " + arr[2]);
		
		//5. 배열의 저장된 값을 한눈에 확인하는 명령
		System.out.println( Arrays.toString(arr));
		
		//6. 배열의 길이를 확인하는 명령
		System.out.println("배열의 길이 : " + arr.length);
		
		//7. 배열의 선언과 생성을 동시에
		byte [] arr2 = new byte[7];
		
		//8. 배열의 선언과 생성과 초기화를 동시에
		short [] arr3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr3));
		
		//short[] arr4 = new short[] {1,2,3,4,5};
		
		//배열의 초기값을 지정하지 않더라도 각 타입의 기본값으로 초기화 됩니다. (0, 0.0, null)
		System.out.println(Arrays.toString(arr2));
		System.out.println("-----------------------");
		
		//1. 문자열 배열을 생성 본인의 이름과, 전화번호를 문자열로 저장
		String [] arr4 = new String[2];
		arr4[0] = "이상현";
		arr4[1] = "01077534706";
		System.out.println(Arrays.toString(arr4));
		//2. 크기가 3인 int형 배열에 1~3까지의 랜덤값을 각각 저장.
		int arr5[] = new int[3];
		arr5[0] = (int)(Math.random() * 3) + 1;
		arr5[1] = (int)(Math.random() * 3) + 1;
		arr5[2] = (int)(Math.random() * 3) + 1;
		System.out.println(Arrays.toString(arr5));
		
		
		
	}
}

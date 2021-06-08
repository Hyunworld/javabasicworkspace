package quiz08;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass extends User {
	public static void main(String[] args) {
		User u1 = new User("홍길동", 123123, 20);
		System.out.println(u1.getName());
		System.out.println(u1.getRrn());
		System.out.println(u1.getAge());
			
		User[] arr = new User[2]; //User타입을 뽑아야하니깐 User[]
		
		User u2 = new User();
		u2.setName("김길동");
		u2.setRrn(456456);
		u2.setAge(30);

		arr[0] = u1;
		arr[1] = u2;
		System.out.println(Arrays.toString(arr)); //name,age,rrn이 저장되있는 객체를 가져옴
		
		for(User u : arr) {  //향산된 for 문!
			System.out.println(u.getName());
			System.out.println(u.getAge());
			System.out.println(u.getRrn());
		}
		
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		User[]  uArr = new User[5];
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(i<uArr.length) {
			System.out.print("이름>");
			String name = scan.next();
			System.out.print("번호>");
			int rrn = scan.nextInt();
			System.out.print("나이>");
			int age = scan.nextInt();
			
			User user = new User(name, rrn, age);
			uArr[i] = user;
				
			i++;
			
			System.out.println(uArr);
		}
		
	}
	}
	

package api.lang.str;

import java.util.Arrays;

//import Quiz16.strQuiz04;


public class MainClass {
	public static void main(String[] args) {
		/*
		char[] arr = {'안', '녕', '하', '세', '요'};
		String str1 = new String(arr)
		String str2 = new String("안녕하세요");
		
		System.out.println(str1);
		System.out.println(str2);
		
		*/
		
		//length - 문자열 길이
		String str = "안녕하세요~";
		System.out.println("문자열길이:" + str.length());
				
		//charAt - 문자열을 인데스 번호 1글자 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//indexof - 문자열을 찾아서 위치 인덱스 반환
		int i1 = str.indexOf("안녕");
		System.out.println("'안녕'이 있는 위치:" + i1);
		int i2 = str.lastIndexOf("안녕");
		System.out.println("'안녕'이 있는 위치:" + i2);
		
		//replace - 특정 문자 변경(중요)
		String str2 = "자바는 재미있습니까? 자바는 커피집이름인데 말이죸ㅋ";
		
		String result2 = str2.replace("자바", "java");
		System.out.println(result2);
		System.out.println(str2);
		
		//replace를 이용한 공백 제거
		String resulrt3 = str2.replace(" ","");
		System.out.println(resulrt3);
		
		//substring - 문자열 자르기(중요)
		String str3 = "123123-456789";
		String result3 = str3.substring(6);
		System.out.println(result3);

		String result4 = str3.substring(7, 10);
		System.out.println(result4);
		
		//toUpperCase, toLowerCase - 대소문자로 변경
		String str4 = "hello world";
		String result5 = str4.toUpperCase();
		System.out.println(result5);
		
		//trim - 문자열 앞 두의 공백안 제거
		String str5 = " 홍길 동";
		String result6 = str5.trim();
		System.out.println(str5);
		System.out.println(result6);
		
		//valueOf 숫자를 -> 문자료
		int a = 1;
		int b = 2;
		System.out.println(String.valueOf(a) + String.valueOf(b));
		
		//split - 문자열 자르기(특정 문자를 기준)
		String str6 = "010-1234-5678";
		String[] arr = str6.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str6.split("-", 1); //잘린 배열의 최대크기
		System.out.println(Arrays.toString(arr2));
		
		//contains - 특정 문자가 포함되어 있다면 true
		String str7 = "우리집 강아지는 곱슬 강아지";
		if(str7.contains("강아지")) {
			System.out.println(str7.contains("강아지 포함"));
		}
		
		//외부라이브러리를 추가하는 방법
		//프로젝트에 src폴더 생성 -> jar파일 추가 -> 우클릭 빌드패스 -> library탭 -> external jar로 파일 추가
//		strQuiz04.Palindrome("에이");
		
		
	}
}

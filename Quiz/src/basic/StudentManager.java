package basic;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	static Scanner scan = new Scanner(System.in);
	
	//학생정보를 저장하는 배열 4개
	static String[] nameList = new String[100];
	static String[] genderList = new String[100];
	static int[] ageList = new int[100];
	
	//현재 사람수가 몇명이 저장되어있는지 알기 위한 변수
	static int count = 0;
	//index(위치)를 조정하기 위한 변수
	static int index = -1;
	
	
	public static void main(String[] args) {
		
		
		ec : while(true) {
			System.out.println("[info]고객수 : " + count + ", 현재위치 : " + index);
			System.out.println("[menu](i).Insert, (p)Prev, (n)Next, (c)Current, (u)Update, (d)Delete, (q)Quit");
			System.out.print("메뉴>");
			String menu = scan.next();
			
			switch(menu) {
			
			case "i" :
				
				input(); //메서드 호출
				
				System.out.println("=============================");
				break;
				
			case "p" :
				System.out.println("================이전 고객 정보================");

				if (index <= 0) {
					System.out.println("이전 정보가 없습니다.");
				}else {
					index--;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("나이 : " + ageList[index]);
				}
				
				System.out.println("==================================");
				break;
			case "n" :
				System.out.println("================다음 고객 정보===================");

				if (index+1 >= count) {
					System.out.println("다음 정보가 없습니다.");
				} else {
					index++;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("나이 : " + ageList[index]);
				}
				
				System.out.println("=====================================");
				break;
				
			case "c" :
				System.out.println("=================현재 고객 정보=================");

				if(index>-1 && index<count) {
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("나이 : " + ageList[index]);
					
					System.out.println("=============================================");
				}
				
				break;
				
			case "u" :
				System.out.println("===================현재 고객 정보 수정=================");
				
				if(index>-1 && index<count) {
					System.out.println("수정할 이름 >");
					nameList[index] = scan.next();
					System.out.println("수정할 성별 >");
					genderList[index] = scan.next();
					System.out.println("수정할 나이 >");
					ageList[index] = scan.nextInt();
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("나이" + ageList[index]);
					System.out.println(" 수정 완료되었습니다.");

				}else {
					System.out.println("수정 실패");
				}
				
				
				System.out.println("=========================================");
				break;
				
			case "d" : 
				System.out.println("==================현재 고객 정보 삭제=================");
				
				if (count>0 && index>-1 && index<count) {
					for(int i = index; i<count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						ageList[i] = ageList[i+1];
					} 
					count--;
					index--;
					System.out.println("삭제가 완료되었습니다.");
					} else {
						System.out.println("삭제 안됨");
				}
				System.out.println("=========================================");
				break;
			
			case "q" :
				
				break ec;
				
			default :
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			} 
			
			
			
		}
		
		System.out.println("시스템을 종료합니다");
		
		
		
		
			} //end main
	
	static void input() {
		System.out.println("==================고객 정보 입력=================");
		
		count ++;
		System.out.print("이름>");
		nameList[count -1] = scan.next();
		System.out.print("성별>");
		genderList[count -1] = scan.next();
		System.out.print("나이>");
		ageList[count -1] = scan.nextInt();
		
		System.out.println("=============================");
		
		
		
	}
}

package basic;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {
	public static void main(String[] args) {
		
		// System.out.printf("%-3s", "o");
		
		/*
		 * 1. 사람수를 입력받을 수 있습니다.
		 * 2. 입력받은 사람만크 랜덤값을 생성해서 배열에 절대 중복되지 않게 랜덤으로 배정
		 * 3. 해당 배열의 크기만큼 ○으로 출력해주세요
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 자리라면
		 * "출력문을 띄우고 다시 선택하오록"
		 * 그리고 선택된 자리를 ●로 다시 표시해 주세요
		 */
		
		
		
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		int arr[] ;
		arr = new int[i];
		for(int j = 0 ; j < i ; j++) {  // 좌석번호 배열
			arr[j] = j+1;
		}
		
		String arr2[] ;             //좌석번호 동그라미
		arr2 = new String [i];
		for(int j=0 ; j<i ; j++)
			arr2[j] = "○";
		
		String arr3[] ;         //자리 구한사람  
		arr3 = new String [i] ;
		for(int j=0 ; j<i ; j++)
			arr3[j] = "0";
			
		
		ec : while (true) {
			
			System.out.println("------------------------------좌석 선택 프로그램(0입력 종료)-------------------------------");
			for(int j=0 ; j<i ; j++) {
				System.out.printf("%-3s",arr[j]);
			} System.out.println();
			for(int j=0 ; j<i ; j++) {
				System.out.printf("%-3s",arr2[j]);
			}
			System.out.println();
			System.out.print("좌석 선택>");
			int c = scan.nextInt();
			

			if (c>0 && c<=i && arr2[c-1] == "○") {
				arr2[c-1] = "●";
				
				int o = (int)(Math.random() * i) +1;
				
				if (arr3[o-1] == "0") {
					arr3[o-1] = "1";
					System.out.println("자리 번호를 공개합니다 : " + o);
					System.out.println(" ");
					}
				
				else if (arr3[o-1] =="1") { 
					while (true) {
						o = (int)(Math.random() * i) +1;
						if(arr3[o-1] == "0") break;
					}
					arr3[o-1] = "1";
					System.out.println("자리 번호를 공개합니다 : " + o);
					System.out.println(" ");
				}
				
			} else if(c == 0) {
				System.out.println("프로그램을 종료합니다");
				break ec;
			}
			else  {
				System.out.println("자리를 다시 선택하세요");
			}
				
				}
			}


	}



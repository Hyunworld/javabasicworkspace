package quiz13;

import java.util.Arrays;

public class Dropship extends Unit{
	
	//1.유닛을 저장할수 있는 8칸 배열을 생성, index변수도 선언
	
	Unit[] arr = new Unit[8];
	int index = 0;
	
	public Dropship() {
		super(0, 0, 200);
	}

	@Override
	public void hold() {
		System.out.println("현재위치>" + x + "," + y);
		stop();
		
	}
	int distance;
	@Override

		public void move(int x, int y) {
			distance = (int) Math.sqrt(Math.pow(x-this.x , 2) + (int)(Math.pow(y-this.y, 2)));
			System.out.println("x축으로" + x + "\ty축으로" + y + "\t이동거리>" + distance);
			this.x = x;
			this.y = y;
	}
	
	/* move의 기능
	 * 수송선이 움직이면 수송선에 타고있는 유닛을 위치를 전부 수송선의 위치로 변경
	 */
	
	/*
	 * 3. 드랍쉽만의 기능 ride()
	 * 
	 * -배열의 크기는 8고정, 수송선안에는 탱크와 마린이 탈 수 있습니다.
	 * 탱크는 4칸, 마린은 8칸
	 * 
	 * - 배열에 유닛이 탈 수 있으면 매개변수로 받은 유닛을 배열에 저장.(단 탱크가 배열에 타면 4칸 처리)
	 * - 배열이 전부 차거나, 탈 수 있는 공간이 없으면 "수송선에 공간이 부족합니다"를 출력 종료
	 * 
	 * - 수송선에 탄 유닛을 전부 가로로 출력 
	 */
	
		public void ride(Unit a) {
			if (a instanceof Marine) { 
				if(8-index > 0) {
					arr[index] = a;
					index++;
					System.out.println("b");
					a.x = x;
					a.y = y;
				} else {
					System.out.println("수송선에 공간이 부족합니다.");
				}
				
			} else if(a instanceof Tank) { System.out.println(index);
				if(8-index > 4) {
					for(int i= 0 ; i<4 ; i++) {
						arr[index] = a;
						index++;
						a.x = x;
						a.y = y;
					}
					} else {
						System.out.println("수송선에 공간이 부족합니다");
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
	
	//Main 에서는 Marine과 탱크 수송선을 생성하고 수송선에 전달하여 확인
}
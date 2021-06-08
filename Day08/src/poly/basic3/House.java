package poly.basic3;

public class House {
	
//	Student[] arr;
//	Employee[] arr2;
//	Teacher[] arr3;
	
	private Person[] arr ;
	private int index;
	
	House() {
		arr = new Person[100];
	}
	
	/*
	 * 1.Person의 자식객체를 전달 받을 수 있는 setIn() 생성하세요.
	 * 기능 - Person배열에 순서대로 자식클래스를 저장
	 * 
	 * 2.info()는 arr에 있는 학생정보를 전부 출력해주는 메서드를 생성하세요.
	 * 
	 * 3.메인클래스에서 6명의 Person을 전달하고 info메서드로 확인
	 */
	
	public void setIn(Person p) {
		arr[index] = p;
		index++; //사람수
	}
	
	public void info() {
		for(int i=0; i< index ; i++) {
			System.out.println(arr[i].info());
		}
	}
	
	
	
	
	
	
}

package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LinkedListEx {
	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<>();
		//Queue<String> list = new LinkedList<>();
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		
		System.out.println(list.toString());
		
		//값 얻기
		String name = list.get(0);
		System.out.println("0번째 인덱스 값:" + name);
		
		//처음에 추가
		list.addFirst("이상현");
		System.out.println(list.toString());
		
		//마지막에 추가
		list.addLast("박찬호");
		System.out.println(list.toString());
		
		
		//push pop
		list.push("신사임당"); 
		System.out.println(list.toString());
		
		System.out.println(list.pop()); //마지막에 들어간걸 삭제하면서 읽rl
		System.out.println(list.toString());
		
		System.out.println(list.peek());
		System.out.println(list.toString());
		
		
		
		
	}
}

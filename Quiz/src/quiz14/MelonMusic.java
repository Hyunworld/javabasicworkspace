package quiz14;

import java.util.Arrays;

public class MelonMusic implements SongList{
	private String[] list = new String[100];
	private int count = 0;
	private int mc = 0;
	@Override
	public void insertList(String song) {
		for(int i = 0; i<=100 ; i++) {
			if (list[i] == null) {
				list[i] = song;
				mc++;
				break;
			}
		}
		
	}
	@Override
	public void playList() {
		for(int i =0; i<count; i++) {
		int a = (int)(Math.random() * mc);
		System.out.println(list[a]);
		}
	}
	
	
	@Override
	public int playLength() {
		for(int i =0 ; i<=100 ; i++) {
			if(list[i] != null) {
				count ++;
			} else {
				System.out.println(count);
				break;
				
			}
		}
		return count;
		}
	
	/*
	 * insertList는 list배열에 매개변수를 순서대로 저장
	 * playList는 배열안에 음악을 램덤하게 출력.
	 * playLength는 음악의 개수를 반환
	 */
}

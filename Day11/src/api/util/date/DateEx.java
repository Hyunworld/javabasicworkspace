package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//날짜 클래스
		Date date = new Date(); //import 유틸 패키지
		
		//날짜 포멧클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String result = sdf.format(date);
		
		System.out.println(result);
		
		sdf = new SimpleDateFormat("yyyyMMdd");
		String result2 = sdf.format(date);
		
		System.out.println(result2);
	}
}

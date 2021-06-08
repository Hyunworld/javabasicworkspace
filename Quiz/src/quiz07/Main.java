package quiz07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		SonicAp fm = new SonicAp("이상현");
		
		fm.land();
		fm.fly();
		fm.flyMode = 1;
		fm.fly();
	}
}

package import_ex;

import java.util.Scanner;

import com.abd.ABC;
import com.def.DEF;

//
//import fruit.Apple;
//import fruit.Orange;
import fruit.*;

public class MainClass {
	public static void main(String[] args) {
		
		Apple a = new Apple();
		Orange O = new Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF(); //ctrl + space
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		System.out.println(i);
		System.out.println(a);
		System.out.println(O);
	}
}

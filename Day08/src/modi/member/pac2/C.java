package modi.member.pac2;

import modi.member.pac1.A;

public class C {

		public C() {
				A a = new A();
				a.var1 = 1;
				//a.var2 = 2; //default (x)
				//a.var3 = 3; //private (x)
				
				a.method01();
				//a.method02(); //default (x)
				//a.method03(); //private (x)
		}
}

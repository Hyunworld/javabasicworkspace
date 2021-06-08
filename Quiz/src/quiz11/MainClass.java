package quiz11;


public class MainClass {
	public static void main(String[] args) {
		Product pd = new Radio();
		Product tb = new Tv();
		Product cm = new Computer();
		MyCart mc = new MyCart(50000);
		mc.buy(pd);
		mc.buy(tb);
		mc.buy(cm);
	}


	}


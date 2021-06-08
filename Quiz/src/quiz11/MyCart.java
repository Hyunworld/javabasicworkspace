package quiz11;

public class MyCart {

	Product[] cart = new Product[1]; //상품을 저장할 배열
	int i = 0;
	int money;
	int totalprice = 0;

	public MyCart(int _money) {
		this.money = _money;

	}

	

	
	/*
	 * 3. buy() 는 모든 상품을 받도록 선언
	 * 가진돈과 전달된 물건의 가격을 비교해서 가진돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에서 배고 add(상품) 메서드를 호출
	 */
	
	public void buy(Product a) {
		
			if (this.money > a.price) {
				this.money -= a.price;
				add(a);
			}  else {
				System.out.println("금액부족");
			}
		}

	
	
	/*
	 * 4.add()는 모든 상품을 받도록 선언
	 * 만약 i의 값이 cart의 크기보다 같거나 크다면 
	 * 기존의 장바구니보다 크기가 2배 큰 배열을 생성
	 * 기존 장바구니에 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * info() 메서드를 호출합니다.
	 */
	
		public void add(Product a) {
			if (i >= cart.length) {
				Product[] arr2 = new Product[2 * cart.length];
				for(int b = 0 ; b < cart.length ; b++) {
					arr2[b] = cart[b];
			}
				this.cart = arr2;
			}
			cart[i] = a;
			i++;
			info();
		}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 이름을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력.
	 * 남은 금액 출력.
	 * 
	 * main buy()만 호출하면 됩니다.
	 */
		
		void info() {
			for(int c = 0; c <  i ; c++) {
				if(cart[c] != null) {
				System.out.println(cart[c].name + "구입");
				System.out.println();
				totalprice += cart[c].price;
				}
			} 
			System.out.println("총금액:" + totalprice);

		
		}
		

}

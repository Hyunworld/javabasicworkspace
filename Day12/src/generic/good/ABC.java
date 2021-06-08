package generic.good;

public class ABC<T> { //꺽쇠가 붙은 제네릭클래스(T는미정)

	private T t ;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}

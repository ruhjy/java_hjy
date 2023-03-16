package ch15.sec06.exam01;

public class Coin {

	private int value;
	private int order;

	public Coin(int order, int value) {
		this.order = order;
		this.value = value;
	}

	public int getvalue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getOrder() {
		return order;
	}
}

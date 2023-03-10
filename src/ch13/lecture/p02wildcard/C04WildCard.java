package ch13.lecture.p02wildcard;

public class C04WildCard {
	public static void main(String[] args) {

		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);

		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);

		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
	}

	public static void printItem(MyClass04<? extends Number> param) {
		// in
		Number num = param.getItem();
		System.out.println(num.doubleValue() * num.doubleValue());

	}
}

class MyClass04<T> {

	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}

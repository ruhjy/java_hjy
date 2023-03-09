package ch13.lecture.p01generic;

public class C04GenericType {
	public static void main(String[] args) {

		MyClass04<String, Integer> o1 = new MyClass04();
		o1.setItem1("hello");
		o1.setItem2(99);

		String s1 = o1.getItem1();
		int s2 = o1.getItem2();

		MyClass04<String, String> o2 = new MyClass04();
		MyClass04<Integer, String> o3 = new MyClass04();

	}
}

class MyClass04<T, U> {

	private T item1;
	private U item2;

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item) {
		this.item1 = item;
	}

	public U getItem2() {
		return item2;
	}

	public void setItem2(U item2) {
		this.item2 = item2;
	}

}

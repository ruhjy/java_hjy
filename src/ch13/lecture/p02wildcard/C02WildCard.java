package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {

		// 값이 나갈 때(out) super
		MyClass02<? super String> o1 = new MyClass02<String>();
		o1.item = new String(); // String 또는 그 하위타입을 대입 가능
//		String s1 = o1.item; // String에 할당 불가

		// 값이 들어올 때(in) extends
		MyClass02<? extends String> o2 = new MyClass02<String>();
//		o2.item = new String(); // String 또는 그 하위타입을 대입 불가능
		String s2 = o2.item; // String에 할당 가능
	}
}

class MyClass02<T> {
	public T item;
}

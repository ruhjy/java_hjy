package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {

		// 값이 나갈 때(out) super
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
//		o1.item = new Number(); // 추상 클래스여서 인스턴스화 못함
		o1.item = new Integer(3);
		o1.item = new Double(3.14);
//		o2.item = new Object(); // xx
//		o1.item = new Object(); // xx

		// 값이 들어올 때(in) extends
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o5 = new MyClass03<Double>();

		Number n1 = o4.item; // ok
		Object o6 = o4.item; // ok
//		Integer i1 = o4.item; // xx

	}
}

class MyClass03<T> {
	public T item;
}
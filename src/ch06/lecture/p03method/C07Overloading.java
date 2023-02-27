package ch06.lecture.p03method;

public class C07Overloading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();

		// 메서드 오버로딩
		o1.method1(9);
		o1.method1(293123L);
		o1.method1(33, 99);
		o1.method1(3, "hello");
		o1.method1("java", 9);

	}
}

package ch06.lecture.p03method;

public class C05Parameter {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();

		o1.method1();
		System.out.println();

		o1.method2(10, 20); // 10 + 20 = 30
		o1.method2(30, 50); // 30 + 50 = 80
		System.out.println();

		o1.method3(7);
		System.out.println();

		o1.method4(9); // 27
		o1.method4(8); // 24

	}
}

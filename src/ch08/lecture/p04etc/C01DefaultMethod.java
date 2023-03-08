package ch08.lecture.p04etc;

public class C01DefaultMethod {
	public static void main(String[] args) {

		MyInterface01 o1 = new MyClass011();
		MyInterface01 o2 = new MyClass012();

		o1.method1();
		o2.method1();

		o1.method2();
		o2.method2();
	}
}

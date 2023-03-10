package ch09.lecture.p02anonymous;

public class C03Anonymous {
	public static void main(String[] args) {

		MyClass03 o1 = new MyClass03() {
			@Override
			void method1() {
				System.out.println("재정의한 메서드");
			}
		};

		o1.method1();
	}
}

abstract class MyClass03 {

	MyClass03() {
	}

	abstract void method1();
}
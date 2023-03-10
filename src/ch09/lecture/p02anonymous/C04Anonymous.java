package ch09.lecture.p02anonymous;

public class C04Anonymous {
	public static void main(String[] args) {

		class SubClass04 extends MyClass04 {
			@Override
			void method1() {
				System.out.println("재정의한 메서드");
			}
		}

		MyClass04 o1 = new SubClass04();
		o1.method1();
	}

}

abstract class MyClass04 {
	abstract void method1();
}

package ch08.exercise.example08;

public class Example {
	public static void main(String[] args) {

		action(new B());
		action(new C());
	}

	public static void action(A a) {

		a.method1();
//		if (a instanceof C c) { // java 12부터 사용가능
//			c.method2();
//		}

		if (a instanceof C) {
			C c = (C) a;
			c.method2();
		}
	}
}

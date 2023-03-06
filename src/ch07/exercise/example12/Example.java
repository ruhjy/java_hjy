package ch07.exercise.example12;

public class Example {
	public static void main(String[] args) {

		action(new A());
		System.out.println();

		action(new B());
		System.out.println();

		action(new C());
	}

	public static void action(A a) {
		a.method1();

		if (a instanceof C c) {
			c.method2();
		}
	}
}

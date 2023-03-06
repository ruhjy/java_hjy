package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {

		SubClass01 o1 = new SubClass01();
		SuperClass01 o2 = o1;

		o2.method1();
	}
}

class SuperClass01 {

	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01 {

	@Override
	public void method1() {
		System.out.println("sub method1");
	}
}
package ch07.exercise.example12;

public class C extends A {

	// 메서드 재정의(오버라이딩)
	@Override
	public void method1() {
		System.out.println("C-method1()");
	}

	public void method2() {
		System.out.println("C-method2()");
	}
}

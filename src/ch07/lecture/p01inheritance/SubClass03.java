package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03 {

	// method1, method2 상속받음

	// 상속받은 메서드는 재정의(Override) 가능 - 오버라이딩
	public void method2() {
		System.out.println("서브클래스 메서드2");
	}

	public void method3() {
		System.out.println("서브클래스 메서드3");
	}
}

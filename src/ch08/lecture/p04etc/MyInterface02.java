package ch08.lecture.p04etc;

public interface MyInterface02 {

	private void common() {
		System.out.println("공통된 코드들.");

	}

	default void method1() {
		common();
		System.out.println("메서드1 코드들.");
	}

	default void method2() {
		common();
		System.out.println("메서드2 코드들.");
	}

}

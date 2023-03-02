package ch06.lecture.p10access.package1;

public class MyClass02 {
	// 필드
	public String name;
	private int age;
	// default 접근 제한자 (package private 접근 제한자)
	boolean married;

	// 메서드
	public void method1() {
		System.out.println("공개 메서드");
	}

	private void method2() {
		System.out.println("프라이빗 메서드");
	}

	// default 접근 제한자 (package private 접근 제한자)
	void method3() {
		System.out.println("기본접근제한자 메서드");
	}
}

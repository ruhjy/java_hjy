package ch08.lecture.p04etc;

public interface MyInterface01 {
	
	void method1();
	
	// default method : interface의 구현된 메서드
	// 접근제한자는 항상 public 생략 가능
	public default void method2() {
		System.out.println("interface의 default method");
		System.out.println("body가 있는 메서드");
	}
}

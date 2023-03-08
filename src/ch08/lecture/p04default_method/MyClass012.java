package ch08.lecture.p04default_method;

public class MyClass012 implements MyInterface01 {

	@Override
	public void method1() {
		System.out.println("class12 override");
	}

	// default 메서드도 재정의 가능
	@Override
	public void method2() {
		System.out.println("class012에서 default 메서드 method2 재정의");
	}
}

package ch07.sec06.package2;

import ch07.sec06.package1.*;

public class D extends A {

	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();
	}

	// 메서드 선언
	public void method() {
		// A 필드값 변경
		this.field = "value";
		// A 메서드 호출
		this.method();
	}

	// 메서드 선언
	public void method2() {
		// 직접 객체 생성해서 사용하는 것은 안됨.
		A a = new A();
		a.field = "value";
		a.method();
	}
}

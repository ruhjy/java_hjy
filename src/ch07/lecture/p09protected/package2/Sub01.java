package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01 {

	@Override
	protected void method1() {
		System.out.println("hello");
	}

	public void method2() {
		// method1()을 오버라이딩하면 가리키는 메서드들이 바뀜.
		// mehtod1()을 오버라이딩 하지 않으면
		// method1()은 부모클래스의 method1()을 가리킴.
		method1(); // this.method1();
		this.method1();
		super.method1();
	}

	public void method3() {
		Super01 o1 = new Super01();
//		o1.method1(); // 다른 패키지여서 안됨
	}

	public static void main(String[] args) {

		Sub01 s = new Sub01();
		s.method2();
	}
}

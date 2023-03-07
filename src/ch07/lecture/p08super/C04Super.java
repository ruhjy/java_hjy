package ch07.lecture.p08super;

public class C04Super {
	public static void main(String[] args) {

		Sub04 o1 = new Sub04();
		o1.method3();
	}
}

class Super04 {

	public void method1() {
		System.out.println(1);
	}

	public void method3() {
		System.out.println(3);
	}
}

class Sub04 extends Super04 {

	public void method2() {
		method1();
	}

	@Override
	public void method3() {
		method1(); // super.method1();
		System.out.println(2);
		this.method3(); // 자기 자신의 method3(), this.method3()
		super.method3(); // 부모 클래스의 method3()
	}
}
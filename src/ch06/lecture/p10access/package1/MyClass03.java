package ch06.lecture.p10access.package1;

public class MyClass03 {

	// 어디서든 접근 가능
	public MyClass03() {

	}

	// 클래스 내에서만 접근 가능
	private MyClass03(int i) {
		
	}

	// 같은 패키지 내에서만 접근 가능
	MyClass03(String s) {
		this(7);
	}

	public void method() {
		MyClass03 o1 = new MyClass03();
	}
}

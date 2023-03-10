package ch09.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {

		MyClass01 o1 = new SubClass01();

	}
}

class MyClass01 {

}

class SubClass01 extends MyClass01 {
	// 클래스 구현
}

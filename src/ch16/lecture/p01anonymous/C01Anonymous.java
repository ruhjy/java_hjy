package ch16.lecture.p01anonymous;

public class C01Anonymous {
	public static void main(String[] args) {

		MyInterface01 o1 = new MyInterface01() {

			@Override
			public void method1() {
				System.out.println("재정의 메서드");
			}
		};
		o1.method1();
	}
}

interface MyInterface01 {
	void method1();
}
package ch16.lecture.p01anonymous;

public class C02Lambda {
	public static void main(String[] args) {

//		MyInterface02 o1 = new MyInterface02() {
//
//			@Override
//			public void method1() {
//				System.out.println("재정의 메서드");
//			}
//		};

		MyInterface02 o1 = () -> System.out.println("재정의한 메서드");

		o1.method1();
	}
}

interface MyInterface02 {
	void method1();
}

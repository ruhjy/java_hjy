package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		// functional interface로 lambda 식 만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메서드@");
		MyInterface01 o2 = () -> System.out.println("또다른 메서드@");
		MyInterface01 o3 = new MyInterface01() {
			@Override
			public void method1() {
				System.out.println("재정의 메서드3");
			}
		};

		o1.method1();
		o2.method1();
		o3.method1();

	}
}

// lambda expression
// 추상 메서드가 하나인 interface의 익명클래스 객체 만드는 코드

// functional Interface : 추상 메서드가 하나인 interface

@FunctionalInterface // 함수형 인터페이스 인것을 보장하기 위한 애노테이션
interface MyInterface01 {

	void method1();

	// Object에 있는 메서드는 추상메서드 수에 포함 안됨.
	String toString();

	default void method2() {
	}

	static void method3() {
	}
}
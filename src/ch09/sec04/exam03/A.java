package ch09.sec04.exam03;

public class A {

	// 메서드
	public void method1(int arg) { // fianl int arg
		// 로컬 변수
		int var = 1; // final int var = 1;

		// 로컬 클래스
		class B {
			// 메서드
			void method2() {
				// 로컬 변수 읽기
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);

				// 로컬 변수 수정
//				 arg = 2; // xx
//				 var = 2; // xx

			}
		}

		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메서드 호출
		b.method2();

	}

	public static void main(String[] args) {
		
		A a = new A();
		a.method1(5);

	}
}

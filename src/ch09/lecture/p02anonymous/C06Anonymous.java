package ch09.lecture.p02anonymous;

public class C06Anonymous {

	public static void main(String[] args) {
		class Sub06 extends MyClass06 {

			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의1");
			}
		}

		MyClass06 o1 = new Sub06();
		method(o1);

		MyClass06 o2 = new MyClass06() {

			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의2 (익명클래스)");
			}
		};
		method(o2);

		method(new MyClass06() {

			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의3 (익명클래스,아규먼트)");
			}
		});

	}

	public static void method(MyClass06 param) {
		param.mymethod();
	}
}

abstract class MyClass06 {
	abstract void mymethod();
}

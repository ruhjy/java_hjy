package ch11.lecture.p05custom;

public class C03CustomException {
	public static void main(String[] args) {

		MyException1 e = new MyException1();
		MyException1 e2 = new MyException1("some message");
		MyException1 e3 = new MyException1();

		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());
		System.out.println();

		System.out.println(e2.toString());
		System.out.println(e3);

	}
}

class MyException1 extends Exception {

	public MyException1() {
	}

	public MyException1(String message) {
		super(message);
	}
}

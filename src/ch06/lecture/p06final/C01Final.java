package ch06.lecture.p06final;

public class C01Final {
	public static void main(String[] args) {
		// final : 값을 한번만 할당할 수 있다.
		int a = 3;
		a = 5;

		final int b = 5;
//		b = 10; // (x)

		method(3);
	}

	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}

	static void method2(final int i) {
		System.out.println(i);
//		i = 9; // (x)
		System.out.println(i);
	}
}

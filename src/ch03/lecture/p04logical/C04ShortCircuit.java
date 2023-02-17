package ch03.lecture.p04logical;

public class C04ShortCircuit {
	public static void main(String[] args) {
		// ||
		// true || true : true
		// true || false : true
		// false || true : true
		// false || false : false

		int x = 10;
		if ((x++ > 100) || (x++ < 0)) {
			System.out.println("실행됨1");
		}
		System.out.println(x); // 12

		x = 10;
		if ((x++ > 100) || (x++ > 0)) {
			System.out.println("실행됨2");
		}
		System.out.println(x); // 12

		x = 10;
		if ((x++ > 0) || (x++ < 100)) {
			System.out.println("실행됨3");
		}
		System.out.println(x); // 11

		x = 10;
		if ((x++ > 0) || (x++ < -100)) {
			System.out.println("실행됨4");
		}
		System.out.println(x); // 11

	}
}

package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		int a = 15_0000_0000;
		int b = 17_0000_0000;

		System.out.println(a);
		System.out.println(b);

		// overflow : 타입의 최대허용값 벗어남
		long c = a + b;
		System.out.println(c);

		long d = -15_0000_0000;
		long e = -17_0000_0000;

		System.out.println(d);
		System.out.println(e);

		// underflow : 타입의 최소값 벗어남
		long f = d + e;
		System.out.println(f);
	}
}

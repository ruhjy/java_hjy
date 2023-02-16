package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /, %

		int i1 = 30;
		int i2 = 50;

		System.out.println(i1 + i2); // 더하기
		System.out.println(i1 - i2); // 빼기
		System.out.println(i1 * i2); // 곱하기
		System.out.println(i1 / i2); // 나누기 - 정수간의 나눗셈 연산값은 정수
		System.out.println(i1 % i2); // 나머지 (modulo)
		System.out.println();

		double d1 = 3.14;
		double d2 = 9.9;

		System.out.println(d2 + d1);
		System.out.println(d2 - d1);
		System.out.println(d2 * d1);
		System.out.println(d2 / d1);
		System.out.println();

		// 정수와 실수의 산술연산
		// 결과는 실수
		int i3 = 10;
		double d3 = 3;

		System.out.println(i3 + d3);
		System.out.println(i3 - d3);
		System.out.println(i3 * d3);
		System.out.println(i3 / d3);
		System.out.println();

		// *, /, %가 +, -보다 우선순위가 높음
		int i4 = 5 + 3 / 2; // 6
		int i5 = 5 * 3 + 10; // 25
		int i6 = 9 + 10 % 3; // 10

		System.out.printf("%d, %d, %d%n", i4, i5, i6);

		int i7 = 5 + (3 / 2); // 6
		int i8 = (5 * 3) + 10; // 25
		int i9 = 9 + (10 % 3); // 10

		System.out.printf("%d, %d, %d%n", i7, i8, i9);
		
		int i10 = (5 + 3) / 2; // 4
		int i11 = 5 * (3 + 10); // 65
		int i12 = (9 + 10) % 3; // 1
		System.out.printf("%d, %d, %d%n", i10, i11, i12);

	}
}

package ch02.lecture.p02type;

public class C11Conversion {
	public static void main(String[] args) {
		int i1;
		long l1;

		i1 = 100;
		l1 = i1; // 문제 없음

		float f1;
		double d1;

		f1 = 3.14F;
		d1 = f1; // 문제 없음

		// 정수 타입간에 작은타입 -> 큰타입 : 자동 형변환
		// 정수에서 실수로 : 자동 형변환

		int i2;
		double d2;

		i2 = 999999;
		d2 = i2; // 정수에서 실수로 자동 형변환

		long l2;
		l2 = 999999999999L;
		d2 = l2;
		System.out.println(d2);

		float f2;
		f2 = l2; // 정수에서 실수로 자동 형변환
		System.out.println(f2); // 어느 수준이 넘어가면 값이 변한다.

		// 문자(char)에서 정수(int, long)으로 자동 형변환
		char c3 = '가';
		int i3 = c3; // 자동 형변환(2byte -> 4byte)
		long l3 = c3; // 자동 형변환(2byte -> 8byte)
		System.out.println(i3 + ", " + l3);

	}

}

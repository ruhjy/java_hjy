package ch02.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		// 정수끼리, 실수끼리
		// 큰타입 -> 작은타입 : 강제형변환(casting)
		int i1; // 4 bytes
		long l1; // 8 bytes

		l1 = 30;
//		i1 = l1; // 오류!!
		i1 = (int) l1; // 강제형변환을 해줘야한다.
		System.out.println(i1);

		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1);
		System.out.println(i1); // int범위를 넘어서서 값이 변함.

		short s1;
		byte b1;

		s1 = 20000;
		b1 = (byte) s1;
		System.out.println(s1);
		System.out.println(b1);

		// 실수 -> 정수 : 강제형변환(casting)
		double d2;
		int i2;

		d2 = 3.14;
		i2 = (int) d2; // 강제 형변환, 소수점 아래 버려짐
		System.out.println(d2);
		System.out.println(i2);
	}
}

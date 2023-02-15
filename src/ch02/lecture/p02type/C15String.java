package ch02.lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		// String과 기본 타입과의 연산
		// + 외에 안됨

		String s1 = "3";
		String s2 = "4";
//		System.out.println(s1 * s2); // 안됨

		// + : 연결연산(concatenate), 문자열 결합
		int i3 = 3;
		String s3 = "4";
//		int r3 = i3 + s3; // 연산결과가 String
		String r3 = i3 + s3; // 연산결과가 String
		System.out.println(r3); // "34"

		System.out.println(3.14 + "hello"); // "3.14hello"
		System.out.println(false + "hi"); // "falsehi"

		String r4 = 3 + 3 + "4"; // "64"
		System.out.println(r4);

		String r5 = "3" + 3 + 4; // "334"
		System.out.println(r5);

		// 기본타입 -> 스트링
		// valueOf 메서드가 있었다.
		// 연결연산
		int i6 = 99;
		String s6 = String.valueOf(i6); // "99"
		String s7 = 99 + ""; // "99"
		System.out.println("s6 = " + s6 + ", s7 = " + s7);

		boolean b8 = false;
		String s8 = String.valueOf(b8); // "false"
		String s9 = b8 + ""; // "false"
		String s10 = false + ""; // "false"
		System.out.println("s8 = " + s8 + ", s9 = " + s9 + ", s10 = " + s10);
	}
}

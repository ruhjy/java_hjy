package ch03.lecture.p03comparison;

public class C02String {
	public static void main(String[] args) {
		// 문자열 같은 지 비교
		// == 사용하지 마세요!!
		// equals 메서드 사용!!! - 5장에서 자세히 설명

		String str1 = "java";
		String str2 = "java";

		boolean r1 = str1 == str2;
		System.out.println(r1); // true

		String str3 = "ja";
		String str4 = "va";
		String str5 = str3 + str4;
		System.out.println(str1); // "java"
		System.out.println(str5); // "java"

		boolean r2 = str1 == str5;
		System.out.println(r2); // false
		System.out.println();

		// equals 메서드 사용
		boolean r3 = str1.equals(str2);
		System.out.println(r3); // true
		boolean r4 = str1.equals(str5);
		System.out.println(r4); // true

		// 다른 지 비교
		// != 사용하지 말 것!!
		// euqals의 연산결과를 반전(!)
		boolean r5 = !str1.equals(str5);
		System.out.println(r5); // false
	}
}

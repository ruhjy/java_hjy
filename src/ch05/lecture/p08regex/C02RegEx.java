package ch05.lecture.p08regex;

public class C02RegEx {
	public static void main(String[] args) {
		// matches
		// 패턴에 맞으면 true, 그렇지 않으면 false

		// 문자 하나 패턴
		System.out.println("a".matches("a")); // ture
		System.out.println("b".matches("b")); // ture
		System.out.println("c".matches("c")); // ture

	}
}

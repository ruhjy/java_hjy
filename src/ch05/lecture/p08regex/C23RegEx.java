package ch05.lecture.p08regex;

public class C23RegEx {
	public static void main(String[] args) {
		// . 을 표현하고 싶을 때
		// \.

		String pattern1 = ".";
		String pattern2 = "\\."; // \.

		System.out.println("a".matches(pattern1)); // true
		System.out.println("a".matches(pattern2)); // false

		System.out.println(".".matches(pattern1)); // true
		System.out.println(".".matches(pattern2)); // true
		System.out.println();

		// 영문대소문자여러개 .com 으로 끝나는지?
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3)); // true
		System.out.println("daum.net".matches(pattern3)); // false
		System.out.println("daumcom".matches(pattern3)); // false
	}
}

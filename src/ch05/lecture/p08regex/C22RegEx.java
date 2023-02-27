package ch05.lecture.p08regex;

public class C22RegEx {
	public static void main(String[] args) {
		// 모든문자
		// Any character (may or may not match line terminators) 일치하거나 일치하지 않거나
		// .

		String pattern1 = ".";

		System.out.println("a".matches(pattern1)); // true
		System.out.println("Z".matches(pattern1)); // true
		System.out.println(" ".matches(pattern1)); // true
		System.out.println("\n".matches(pattern1)); // false
		System.out.println("_".matches(pattern1)); // true
		System.out.println();

		String pattern2 = ".{3}";

		System.out.println("가나다".matches(pattern2)); // true
		System.out.println("   ".matches(pattern2)); // true
		System.out.println("가 a".matches(pattern2)); // true
		System.out.println("    ".matches(pattern2)); // false 빈칸4개
	}
}

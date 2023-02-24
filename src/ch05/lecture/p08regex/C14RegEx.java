package ch05.lecture.p08regex;

public class C14RegEx {
	public static void main(String[] args) {
		// n개 이상 : {n,}
		// {1,}, + : 1개 이상

		// 영소문자 1개 이상 : [a-z]{1,}, [a-z]+
		String pattern1 = "[a-z]{1,}";
		String pattern2 = "[a-z]+";

		System.out.println("abc".matches(pattern1)); // true
		System.out.println("a".matches(pattern1)); // true
		System.out.println("A".matches(pattern1)); // false

		System.out.println("abc".matches(pattern2)); // true
		System.out.println("a".matches(pattern2)); // true
		System.out.println("A".matches(pattern2)); // false

	}
}

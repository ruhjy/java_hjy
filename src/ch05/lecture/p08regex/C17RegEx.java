package ch05.lecture.p08regex;

public class C17RegEx {
	public static void main(String[] args) {
		// 영문대소문자, $, _, 숫자

		String pattern1 = "[a-zA-Z$_]+[a-zA-Z0-9$_]*";

		System.out.println("modelName".matches(pattern1)); // true
		System.out.println("class".matches(pattern1)); // true
		System.out.println("$value".matches(pattern1)); // true
		System.out.println("_age".matches(pattern1)); // true
		System.out.println("int".matches(pattern1)); // true
		System.out.println("6hour".matches(pattern1)); // false
		System.out.println("#name".matches(pattern1)); // false
	}
}

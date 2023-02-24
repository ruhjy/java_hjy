package ch05.lecture.p08regex;

public class C08RegEx {
	public static void main(String[] args) {

		System.out.println("a".matches("[0-9a-zA-Z]")); // true
		System.out.println("Z".matches("[0-9a-zA-Z]")); // true
		System.out.println("0".matches("[0-9a-zA-Z]")); // true
		System.out.println();

		// 영문대소문자, 숫자로 이루어진 3글자 인가?
		System.out.println("010".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]")); // true
		System.out.println("abc".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]")); // true
		System.out.println("aZ3".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]")); // true
		System.out.println();
	}
}

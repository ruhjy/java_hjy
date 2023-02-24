package ch05.lecture.p08regex;

public class C09RegEx {
	public static void main(String[] args) {
		// character class
		// negation(not) ^

		// 숫자가 아니면 일치
		System.out.println("0".matches("[^0-9]")); // false
		System.out.println("ㅁ".matches("[^0-9]")); // true
		System.out.println(" ".matches("[^0-9]")); // true
		System.out.println("a".matches("[^0-9]")); // true
		System.out.println("z".matches("[^0-9]")); // true
		System.out.println("$".matches("[^0-9]")); // true
		System.out.println();
	}
}

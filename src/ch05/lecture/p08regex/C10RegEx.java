package ch05.lecture.p08regex;

public class C10RegEx {
	public static void main(String[] args) {
		// quantifier (수량자)

		// 숫자 3개인가
		System.out.println("010".matches("[0-9][0-9][0-9]")); // true
		System.out.println("010".matches("[0-9]{3}")); // true
		System.out.println("123".matches("[0-9]{3}")); // true
		System.out.println("12".matches("[^0-9]")); // false
		System.out.println("1233".matches("[^0-9]")); // false
		System.out.println("ab0".matches("[^0-9]")); // false
		System.out.println();
	}
}

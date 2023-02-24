package ch05.lecture.p08regex;

public class C07RegEx {
	public static void main(String[] args) {

		System.out.println("a".matches("[a-zA-Z]")); // true
		System.out.println("b".matches("[a-zA-Z]")); // true
		System.out.println("z".matches("[a-zA-Z]")); // true
		System.out.println("A".matches("[a-zA-Z]")); // true
		System.out.println("Z".matches("[a-zA-Z]")); // true
		System.out.println();

		System.out.println("0".matches("[a-zA-Z]")); // false
		System.out.println("1".matches("[a-zA-Z]")); // false
		System.out.println("9".matches("[a-zA-Z]")); // false
		System.out.println();

		System.out.println("0".matches("[0-9]")); // true
		System.out.println("1".matches("[0-9]")); // true
		System.out.println("9".matches("[0-9]")); // true

	}
}

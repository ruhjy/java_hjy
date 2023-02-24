package ch05.lecture.p08regex;

public class C05RegEx {
	public static void main(String[] args) {

		System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]")); // ture
		System.out.println("b".matches("[abcdefghijklmnopqrstuvwxyz]")); // true
		System.out.println("x".matches("[abcdefghijklmnopqrstuvwxyz]")); // true
		System.out.println("z".matches("[abcdefghijklmnopqrstuvwxyz]")); // true
		System.out.println("a".matches("[a-z]")); // true
		System.out.println("b".matches("[a-z]")); // true
		System.out.println("x".matches("[a-z]")); // true
		System.out.println("z".matches("[a-z]")); // true
	}
}

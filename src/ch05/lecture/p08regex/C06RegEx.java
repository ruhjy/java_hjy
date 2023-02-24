package ch05.lecture.p08regex;

public class C06RegEx {
	public static void main(String[] args) {

		System.out.println("Az".matches("[A-Z][a-z]")); // true
		System.out.println("Bx".matches("[A-z][a-z]")); // true
		System.out.println("Za".matches("[A-Z][a-z]")); // true
		
		System.out.println("za".matches("[A-z][A-z]")); // true
		System.out.println("zZ".matches("[A-z][A-z]")); // true
	}
}

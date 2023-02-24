package ch05.lecture.p08regex;

public class C15RegEx {
	public static void main(String[] args) {
		// n개 이상 : {n,}
		// {0,}, * : 0개 이상

		// 숫자 0~9 0개 이상 : [0-9]{0,}, [0-9]*
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";

		System.out.println("".matches(pattern1)); // true
		System.out.println("".matches(pattern2)); // true

		System.out.println("2".matches(pattern1)); // true
		System.out.println("2".matches(pattern2)); // true

		System.out.println("25".matches(pattern1)); // true
		System.out.println("25".matches(pattern2)); // true

		System.out.println("2a5".matches(pattern1)); // false
		System.out.println("2a5".matches(pattern2)); // false
	}
}

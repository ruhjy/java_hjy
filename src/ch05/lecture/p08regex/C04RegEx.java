package ch05.lecture.p08regex;

public class C04RegEx {
	public static void main(String[] args) {

		System.out.println("ab".matches("ab")); // ture
		System.out.println("bc".matches("bc")); // ture

		// [...] 이게 한글자
		System.out.println("ab".matches("[abc][abc]")); // ture
		System.out.println("aa".matches("[abc][abc]")); // true
		System.out.println("ac".matches("[abc][abc]")); // true
		System.out.println("ba".matches("[abc][abc]")); // true
		System.out.println("bb".matches("[abc][abc]")); // true
		System.out.println("bc".matches("[abc][abc]")); // true
		System.out.println("ca".matches("[abc][abc]")); // true
		System.out.println("cb".matches("[abc][abc]")); // true
		System.out.println("cc".matches("[abc][abc]")); // true

	}
}

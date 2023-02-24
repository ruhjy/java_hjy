package ch05.lecture.p08regex;

public class C03RegEx {
	public static void main(String[] args) {
		// character class(문자분류)
		
		
		// "[...]" 분류 abc중에 하나인가
		// 이 문자들로 분류된 패턴인가
		System.out.println("a".matches("[abc]")); // ture
		System.out.println("b".matches("[abc]")); // ture
		System.out.println("c".matches("[abc]")); // ture
		System.out.println("d".matches("[abc]")); // false
	}
}

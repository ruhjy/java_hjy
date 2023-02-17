package ch03.lecture.p06string;

public class C06ToLowerCase {
	public static void main(String[] args) {
		// toLowerCase
		// 소문자로 바꾼 문자열 리턴

		// toUpperCase
		// 대문자로 바꾼 문자열 리턴
		// return type : String
		// index       0123456789..
		String str1 = "I'm IronMan.";
		String res1 = str1.toLowerCase();
		System.out.println(str1);
		System.out.println(res1); // i'm ironman.

		String res2 = str1.toUpperCase();
		System.out.println(res2); // I'M IRONMAN.

		// 대소문자 구분없이 문자열 위치 확인
		String res3 = str1.toLowerCase();
		System.out.println(str1.indexOf("ir")); // -1 ir(x). Ir(o)
		System.out.println(res3.indexOf("ir")); // 4
		System.out.println(str1.toLowerCase().indexOf("ir")); // 4
		
		// 대소문자 구분없이 특정 문자열이 있는 지 확인
		String str4 = "lorem ipSum";
		
		String res4 = str4.toLowerCase();
		System.out.println(str4.contains("sum")); // false
		System.out.println(res4.contains("sum")); // true
		
		System.out.println(str4.toUpperCase().contains("SUM")); // true);
		

	}
}

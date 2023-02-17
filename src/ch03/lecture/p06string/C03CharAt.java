package ch03.lecture.p06string;

public class C03CharAt {
	public static void main(String[] args) {
		// charAt
		// 특정 위치(index)에 있는 문자(char) 확인
		// index 	   012345
		String str1 = "spring";

		System.out.println("길이 : " + str1.length());

		char c1 = str1.charAt(0);
		System.out.println(c1); // s

		char c2 = str1.charAt(1);
		System.out.println(c2); // p

		System.out.println(str1.charAt(2)); // r

		System.out.println(str1.charAt(5)); // g
		System.out.println(str1.charAt(str1.length() - 1)); // g 

	}
}

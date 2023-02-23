package ch05.lecture.p04string;

public class C01String {
	public static void main(String[] args) {

		String str1;
		String str2;
		String str3;

		str1 = new String("hello");
		str2 = new String("hello");
		str3 = str2;

		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		System.out.println();

	}
}

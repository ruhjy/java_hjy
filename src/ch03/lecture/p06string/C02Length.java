package ch03.lecture.p06string;

public class C02Length {
	public static void main(String[] args) {
		// length
		// 문자열의 길이 확인할 때 사용하는 메서드
		// return type : int
		
		String str1 = "java";
		String str2 = "spring";
		String str3 = "hello world";
		String str4 = """
				동해물과 백두산이
				마르고 닳도록
				""";
		
		int len1 = str1.length();
		System.out.println(len1); // 4
		System.out.println(str2.length()); // 6
		System.out.println(str3.length()); // 11
		System.out.println(str4.length()); // 18
	}
}

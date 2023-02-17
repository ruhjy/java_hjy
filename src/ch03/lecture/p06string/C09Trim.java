package ch03.lecture.p06string;

public class C09Trim {
	public static void main(String[] args) {
		// trim
		// 문자의 앞, 뒤 공백 제거 (문자 사이의 공백은 해당 없음)
		// return type : String
		
		String str1 = "    my   spring    ";
		System.out.println(str1); //     my   spring
		String str2 = str1.trim();
		System.out.println(str2); // my   spring
	}
}

package ch03.lecture.p06string;

public class C10IsEmpty {
	public static void main(String[] args) {
		// isEmpty
		// 빈 문자열("")인지 확인
		// return type : boolean
		
		String str1 = "java";
		String str2 = " ";
		String str3 = "";
		
		System.out.println(str1.isEmpty()); // false
		System.out.println(str2.isEmpty()); // false
		System.out.println(str3.isEmpty()); // true
		
		// isEmpty와 같은 기능? 결과
		System.out.println(str1.equals("")); // false
		System.out.println(str2.equals("")); // false
		System.out.println(str3.equals("")); // true
	}
}

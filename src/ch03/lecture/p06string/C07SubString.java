package ch03.lecture.p06string;

public class C07SubString {
	public static void main(String[] args) {
		// substring
		// 문자열의 일부(substring)를 리턴
		// return type : String
		
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않는 이유";
		// 첫번째 파라미터 : 시작 index(포함)
		// 두번째 파라미터 : 종료 index(포함안됨)
		String res1 = str1.substring(0, 2);
		System.out.println(res1); // 중국
		
		String res2 = str1.substring(3, 6);
		System.out.println(res2); // 재개방
		
		// index 8번부터 문자열의 길이까지(끝까지)
		System.out.println(str1.substring(8, str1.length()));
		// 파라미터 하나 : 입력 index부터 끝까지
		System.out.println(str1.substring(8)); // 위와 같은 코드
		
		// 배열의 길이에서 -2 뒤에서 두글자
		System.out.println(str1.substring(str1.length() - 2)); // 이유
		
		// 파라미터가 인덱스를 벗어나면 오류
		String str2 = "java";
		System.out.println(str2.substring(2, 4));
		// StringIndexOutOfBoundsException 발생 - 배열의 범위 벗어남
//		System.out.println(str2.substring(2, 5));

	}
	
}

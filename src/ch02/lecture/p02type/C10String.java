package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		// String (참조타입)
		// 문자열 저장

		String s1;
		s1 = "hello world";

		s1 = "h";

//		char c2 = s1; // 컴파일 에러

		s1 = "";

		char c1 = '가';

//		s1 = c1; // 컴파일 에러

		String s2 = "i am \"ironman\""; // 큰따옴표는 역슬래시(\) 사용
		System.out.println(s2);
		
		String s3 = "i \\"; // 역슬래시 사용
		System.out.println(s3);
		
		String s4 = "i am \n ironman"; // \n 줄바꿈
		System.out.println(s4);
		System.out.println();
		
//		String s5 = "<h1>hello <span>world</span></h1>";
		String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>";
		System.out.println(s5);
		System.out.println();
		
		// text block
		// 첫번째 엔터 무시
		// 가장 작은 들여쓴 줄이 들여쓰기 기준
		String s6 = """
				<h1>
					'hello'
					<span>"world"</span>
				</h1>
				""";
		System.out.println(s6);
		
	}
}

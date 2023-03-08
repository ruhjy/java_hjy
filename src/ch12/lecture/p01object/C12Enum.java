package ch12.lecture.p01object;

public class C12Enum {
	public static void main(String[] args) {

		// 0: 봄, 1: 여름, 2: 가을, 3: 겨울
		int season = 1;

		String s = switch (season) {
			case 0, 2 -> "좋은 계절이다.";
			case 1 -> "덥다.";
			case 3 -> "춥다";
			default -> "잘못입력됨.";
		};

		System.out.println(s);

	}
}

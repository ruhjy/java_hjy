package ch04.lecture.p05break;

public class C04Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 500; i++) {

			System.out.println("실행코드1");

			if (false) {
				continue;
			}

			System.out.println("실행코드2");
		}
	}
}

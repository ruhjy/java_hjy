package ch04.lecture.p05break;

public class C01Break {
	public static void main(String[] args) {
		// break
		// 반복문(for, while, do while) 종료

		while (true) {
			System.out.println("코드 반복1");
			System.out.println("코드 반복2");

			if (true) {
				break;
			}

			System.out.println("코드 반복3");
			System.out.println("코드 반복4");
		}
	}
}

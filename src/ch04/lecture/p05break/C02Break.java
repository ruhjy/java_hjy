package ch04.lecture.p05break;

public class C02Break {
	public static void main(String[] args) {
		// 4x + 5y = 60
		// 해가 되는 (x, y) 출력
		outer: 
		for (int x = 1; x <= 10; x++) {

			for (int y = 1; y <= 10; y++) {

				int r = (4 * x) + (5 * y);

				if (r == 60) {
					System.out.printf("(%d, %d)%n", x, y);
					break outer;
				}
			}
		}
	}
}

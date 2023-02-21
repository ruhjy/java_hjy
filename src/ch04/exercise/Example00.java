package ch04.exercise;

public class Example00 {
	public static void main(String[] args) {

		// 1
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 2
		System.out.println("문제2");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= (i + 1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 3
		System.out.println("문제3");
		for (int i = 0; i < 5; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		

		for (int i = 0; i < 5; i++) {
			System.out.print("세로");
			for (int j = 0; j <= i; j++) {
				System.out.print("가로");
			}
			System.out.println();
		}
	}
}

package ch04.sec04;

public class PrintFrom1To10Example {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 5; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

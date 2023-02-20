package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		do {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d, %d)%n", num1, num2);
		} while ((num1 + num2) != 5); // num1과 num2의 합이 5가 아닐동안..
	}
}

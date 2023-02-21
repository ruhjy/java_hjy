package ch04.exercise;

public class ExampleFor03 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		//  i += 3; sum += i;

		System.out.println("1~100까지의 정수 중에서 3의 배수의 총합 : " + sum);
	}
}

package ch04.exercise;

public class ExampleWhile03 {
	public static void main(String[] args) {

		// 방법1
		int i = 1;
		int sum = 0;

		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("3의 배수의 총합 : " + sum);

		// 방법2
		int j = 0;
		int sum2 = 0;

		while (j <= 100) {
			sum2 += j;
			j += 3;
		}
		System.out.println("3의 배수의 총합 : " + sum2);
	}
}

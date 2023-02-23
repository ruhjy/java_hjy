package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {

//		int[] array = { -1, -5, -3, -8, -2 };
//		int max = Integer.MIN_VALUE; // 음수일 때 사용

		int[] array = { 1, 5, 3, 8, 2 };

		// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.
		// (for 문 이용)

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println(max);
	}
}

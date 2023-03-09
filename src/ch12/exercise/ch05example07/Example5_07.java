package ch12.exercise.ch05example07;

public class Example5_07 {
	public static void main(String[] args) {

		// Math.max()를 이용해서 주어진 배열에 최대값을 출력
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
//		for (int i = 0; i < array.length; i++) {
//			max = Math.max(max, array[i]);
//		}
//		System.out.println("max : " + max);

		for (int k : array) {
			max = Math.max(max, k);
		}
		System.out.println("max : " + max);
	}
}
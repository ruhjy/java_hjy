package ch05.exercise;

public class Example07WithIndex {
	public static void main(String[] args) {

		int[] array = { 1, 5, 3, 8, 2 };

		int max = Integer.MIN_VALUE;
		int indexOfMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				indexOfMax = i;
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최대값의 index : " + indexOfMax);

	}
}

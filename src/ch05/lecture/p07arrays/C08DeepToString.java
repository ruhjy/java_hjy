package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {

		int[] arr1 = { 5, 2, 1, 0 };

		System.out.println(Arrays.toString(arr1)); // [5, 2, 1, 0]
		System.out.println();

		int[][] arr2 = {
				{ 7, 8 },
				{ 2, 3 }
		};
		System.out.println(arr2[0]); // [I@515f550a
		System.out.println(Arrays.toString(arr2)); // [[I@515f550a, [I@626b2d4a]
		System.out.println();

		System.out.println("for loop로 toString");
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr)); // [7, 8] [2, 3]
		}
		System.out.println();

		System.out.println("deepToString 메서드 사용");
		System.out.println(Arrays.deepToString(arr2)); // [[7, 8], [2, 3]]
	}
}

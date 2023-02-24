package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 9, 2, 1 };

		// 파리미터(원본배열(복사할 배열), 타겟배열의 길이)
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.equals(arr1, arr2)); // true
		System.out.println(arr1 == arr2); // false

		System.out.println(Arrays.toString(arr1)); // [3, 5, 9, 2, 1]
		System.out.println(Arrays.toString(arr2)); // [3, 5, 9, 2, 1]

		arr1[0] = 33;
		System.out.println(Arrays.toString(arr1)); // [33, 5, 9, 2, 1]
		System.out.println(Arrays.toString(arr2)); // [3, 5, 9, 2, 1]
	}
}

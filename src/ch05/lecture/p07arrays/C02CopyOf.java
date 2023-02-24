package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C02CopyOf {
	public static void main(String[] args) {

		int[] arr1 = { 9, 8, 1, 2, 3 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.equals(arr1, arr2)); // true
		System.out.println(arr1 == arr2); // false
		System.out.println(Arrays.toString(arr1)); // [9, 8, 1, 2, 3]
		System.out.println(Arrays.toString(arr2)); // [9, 8, 1, 2, 3]

		arr1[0] = 99;
		System.out.println(Arrays.toString(arr1)); // [99, 8, 1, 2, 3]
		System.out.println(Arrays.toString(arr2)); // [9, 8, 1, 2, 3]
	}
}

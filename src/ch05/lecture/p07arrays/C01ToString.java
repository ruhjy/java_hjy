package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {

		int[] arr1 = { 9, 8, 7, 1, 2 };

		for (int n : arr1) {
			System.out.print(n + " "); // 9 8 7 1 2
		}
		System.out.println();

		System.out.println(arr1); // [I@515f550a
		System.out.println(Arrays.toString(arr1)); // [9, 8, 7, 1, 2]
		System.out.println();

		String[] arr2 = { "java", "hello", "friday", "sunday" };
		System.out.println(arr2); // [Ljava.lang.String;@626b2d4a
		System.out.println(Arrays.toString(arr2)); // [java, hello, friday, sunday]
	}
}

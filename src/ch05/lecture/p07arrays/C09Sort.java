package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Sort {
	public static void main(String[] args) {

		// sort : 정렬
		int[] arr1 = { 9, 0, 2, 3, 8, -1 };

		System.out.println(Arrays.toString(arr1)); // [9, 0, 2, 3, 8, -1]
		System.out.println();

		// 정렬(오름차순)
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); // [-1, 0, 2, 3, 8, 9]
		System.out.println();

		String[] arr2 = { "java", "hello", "html", "css" };
		System.out.println(Arrays.toString(arr2)); // [java, hello, html, css]
		System.out.println();

		// 정렬
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); // [css, hello, html, java]
		System.out.println();

		String[] arr3 = { "java", "hello", "html", "css", "Java", "Css" };
		System.out.println(Arrays.toString(arr3));
		// [java, hello, html, css, Java, Css]
		System.out.println();

		// 정렬
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		// [Css, Java, css, hello, html, java]

	}
}

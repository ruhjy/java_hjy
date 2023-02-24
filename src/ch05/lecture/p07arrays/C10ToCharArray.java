package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10ToCharArray {
	public static void main(String[] args) {

		// String의 toCharArray
		String str1 = "hello world!";
		String[] arr1 = str1.split("");

		System.out.println(Arrays.toString(arr1));

		char[] arr2 = str1.toCharArray();
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}

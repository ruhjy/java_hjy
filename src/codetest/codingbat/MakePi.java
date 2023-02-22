package codetest.codingbat;

import java.util.Arrays;

public class MakePi {
	public static void main(String[] args) {
		int[] arr1 = makePi();
		System.out.println(Arrays.toString(arr1));
	}

	public static int[] makePi() {
		return new int[] { 3, 1, 4 };
	}
}

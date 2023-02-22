package codetest.codingbat;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum3 {
	public static void main(String[] args) {
		int n1 = sum3(new int[] { 1, 2, 3 });
		int n2 = sum3(new int[] { 5, 11, 2 });
		int n3 = sum3(new int[] { 7, 0, 0 });

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

	public static int sum3(int[] nums) {
		return Arrays.stream(nums).sum();
	}
}

package codetest.codingbat;

import java.util.Arrays;

public class SameFirstLast {
	public static void main(String[] args) {
		boolean b1 = sameFirstLast(new int[] { 1, 2, 3 });
		boolean b2 = sameFirstLast(new int[] { 1, 2, 3, 1 });
		boolean b3 = sameFirstLast(new int[] { 1, 2, 1 });
		boolean b4 = sameFirstLast(new int[] {});
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		int[] arr = new int[0];
		System.out.println(Arrays.toString(arr));

	}

	public static boolean sameFirstLast(int[] nums) {

		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}
}

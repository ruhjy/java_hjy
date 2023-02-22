package codetest.codingbat;

import java.util.Arrays;

public class MaxEnd3 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(maxEnd3(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(maxEnd3(new int[] { 11, 5, 9 })));
		System.out.println(Arrays.toString(maxEnd3(new int[] { 2, 11, 3 })));
	}

	public static int[] maxEnd3(int[] nums) {
		int[] answer = new int[nums.length];
		int result = 0;

		if (nums[0] > nums[nums.length - 1]) {
			result = nums[0];
		} else {
			result = nums[nums.length - 1];
		}

		for (int i = 0; i < nums.length; i++) {
			answer[i] = result;
		}

		return answer;
	}
}

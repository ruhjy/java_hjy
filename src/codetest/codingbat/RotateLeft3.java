package codetest.codingbat;

import java.util.Arrays;

public class RotateLeft3 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(rotateLeft3(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(rotateLeft3(new int[] { 5, 11, 9 })));
		System.out.println(Arrays.toString(rotateLeft3(new int[] { 7, 0, 0 })));
	}

	public static int[] rotateLeft3(int[] nums) {
		int[] answer = new int[nums.length];

		answer[0] = nums[1];
		answer[1] = nums[2];
		answer[2] = nums[0];

		return answer;
	}
}

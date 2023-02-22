package codetest.codingbat;

public class FirstLast6 {
	public static void main(String[] args) {
		boolean b1 = firstLast6(new int[] { 1, 2, 6 });
		boolean b2 = firstLast6(new int[] { 6, 1, 2, 3 });
		boolean b3 = firstLast6(new int[] { 13, 6, 1, 2, 3 });

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

	public static boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}
}

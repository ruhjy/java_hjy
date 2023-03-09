package codetest.codingbat;

public class BigDiff {
	public static void main(String[] args) {
		System.out.println(bigDiff(new int[] { 10, 3, 5, 6 }));
		System.out.println(bigDiff(new int[] { 7, 2, 10, 9 }));
		System.out.println(bigDiff(new int[] { 2, 10, 7, 2 }));
	}

	static int bigDiff(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int k : nums) {
			max = Math.max(max, k);
		}
		for (int k : nums) {
			min = Math.min(min, k);
		}

		return max - min;

//		int max = IntStream.of(nums).max().getAsInt();
//		int min = IntStream.of(nums).min().getAsInt();
//		return max - min;

	}
}

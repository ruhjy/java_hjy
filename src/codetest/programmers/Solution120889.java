package codetest.programmers;

import java.util.Arrays;

public class Solution120889 {
	public static void main(String[] args) {
		int s1 = solution(new int[] { 1, 2, 3 });
		int s2 = solution(new int[] { 3, 6, 2 });
		int s3 = solution(new int[] { 199, 72, 222 });

		System.out.printf("%d, %d, %d%n", s1, s2, s3);

	}

	public static int solution(int[] sides) {

		Arrays.sort(sides);

		if ((sides[0] + sides[1]) > sides[2]) {
			return 1;
		} else {
			return 2;
		}
	}
}

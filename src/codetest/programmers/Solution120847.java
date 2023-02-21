package codetest.programmers;

import java.util.Arrays;

public class Solution120847 {
	public static void main(String[] args) {

		int[] arr = { 0, 31, 24, 10, 1, 9 };

		System.out.println(Solution11.solution(arr));

	}
}

class Solution11 {
	public static int solution(int[] numbers) {
		int answer = 0;
		Arrays.sort(numbers);
		int max1 = numbers[numbers.length - 1];
		int max2 = numbers[numbers.length - 2];

		answer = max1 * max2;
		return answer;
	}
}
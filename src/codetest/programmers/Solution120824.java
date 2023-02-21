package codetest.programmers;

import java.util.Arrays;

public class Solution120824 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(Solution12.solution(arr)));

	}
}

class Solution12 {
	public static int[] solution(int[] num_list) {
		int[] answer = { 0, 0 };

		int num1 = 1;
		int num2 = 1;
		for (int i = 1; i <= num_list.length; i++) {
			if (num_list[i - 1] % 2 == 0) {
				answer[0] = num1++;
			} else {
				answer[1] = num2++;
			}
		}

		return answer;
	}
}
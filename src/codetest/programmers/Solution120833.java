package codetest.programmers;

import java.util.Arrays;

public class Solution120833 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 3, 5 };

		System.out.println(Arrays.toString(solution(arr1, 0, 3)));
		System.out.println(Arrays.toString(solution(arr2, 1, 2)));

	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		int len = num2 - num1 + 1;
		int[] answer = new int[len];

		for (int i = num1; i <= num2; i++) {
			answer[i - num1] = numbers[i];
		}

		return answer;
	}

//	public static int[] solution(int[] numbers, int num1, int num2) {
//		int[] answer = new int[num2];
//		
//		answer = Arrays.copyOfRange(numbers, num1, num2+1);
//
//		return answer;
//	}
}

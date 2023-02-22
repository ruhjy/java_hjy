package codetest.programmers;

import java.util.Arrays;

public class Solution120821 {
	public static void main(String[] args) {

		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] intArr2 = { 1, 1, 1, 1, 1, 2 };
		int[] intArr3 = { 1, 0, 1, 1, 1, 3, 5 };
		Solution6 s = new Solution6();
		System.out.println(Arrays.toString(s.solution(intArr1)));
		System.out.println(Arrays.toString(s.solution(intArr2)));
		System.out.println(Arrays.toString(s.solution(intArr3)));
	}
}

class Solution6 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];

		for (int i = 1; i <= num_list.length; i++) {
			answer[i - 1] += num_list[num_list.length - i];
		}

		return answer;
	}
}

//class Solution {
//	public int[] solution(int[] num_list) {
//		int[] answer = new int[num_list.length];
//
//		for (int i = 0; i < num_list.length; i++) {
//			answer[i] += num_list[(num_list.length - 1) - i];
//		}
//		return answer;
//	}
//}
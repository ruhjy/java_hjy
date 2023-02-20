package codetest.programmers;

import java.util.Arrays;

public class Solution120854 {
	public static void main(String[] args) {

		String[] strArr1 = { "We", "are", "the", "world!" };
		String[] strArr2 = { "I", "Love", "Programmers." };

		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(strArr1)));
		System.out.println(Arrays.toString(s.solution(strArr2)));
	}
}

class Solution4 {
	public int[] solution(String[] strlist) {
		int[] answer = {};

		answer = new int[strlist.length];
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		return answer;
	}
}
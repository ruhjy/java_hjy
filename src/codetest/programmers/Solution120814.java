package codetest.programmers;

import java.util.Arrays;

public class Solution120814 {
	public static void main(String[] args) {

		Solution5 s = new Solution5();
		System.out.println(s.solution(7));
		System.out.println(s.solution(1));
		System.out.println(s.solution(15));
		System.out.println(s.solution(100));
	}
}

class Solution5 {
	public int solution(int n) {
		int answer = 0;
		int pizza = 7;

		if (n <= pizza && n > 0) {
			return answer = 1;
		} else {
			return answer = (int)Math.ceil((n / (double)pizza));
		}
//	} else if (n > pizza && n % pizza != 0) {
	}
}
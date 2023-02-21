package codetest.programmers;

public class Solution120831 {
	public static void main(String[] args) {

		Solution2 s = new Solution2();
		System.out.println(s.solution(10));

	}
}

class Solution2 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		return answer;
	}
}

//class Solution2 {
//	public int solution(int n) {
//		int answer = 0;
//
//		for (int i = 0; i <= n; i += 2) {
//			answer += i;
//		}
//		return answer;
//	}
//}
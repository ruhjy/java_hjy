package codetest.programmers;

import java.util.Arrays;

public class Solution120892 {

	class Solution8 {
		public String solution(String cipher, int code) {
			String answer = "";

			for (int i = code - 1; i < cipher.length(); i += code) {
				answer += cipher.charAt(i);
			}

			return answer;
		}
	}

	class Solution8_2 {
		public String solution(String cipher, int code) {
			String answer = "";
			String[] strArr = cipher.split("");

			for (int i = code - 1; i < cipher.length(); i += code) {
				answer += strArr[i];
			}

			return answer;
		}
	}
}
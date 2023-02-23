package codetest.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120913 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(solution("abcdef123", 3)));

//		String a = "abc1Addfggg4556b";
//		System.out.println(a.length());
//
//		System.out.println((int) (Math.ceil(a.length() / (double) 6)));
	}

//	public static String[] solution(String my_str, int n) {
//
//		int len = (int) (Math.ceil(my_str.length() / (double) n));
//		int[] answer = new int[len];
//
//		for (int i = 1; i <= len; i++) {
//			answer[i - 1] = my_str.substring(0, n);
//		}
//
//		return answer;
//	}

	public static String[] solution(String my_str, int n) {
		// 배열의 길이
		int len = my_str.length();

		// 배열의 범위 계산식
		int answerLength = (len - 1) / n + 1;

		// answer 배열 생성
		String[] answer = new String[answerLength];

		int start = 0; // beginIndex
		int end = n; // endIndex
		
		// 배열의 인덱스
		int i = 0;
		// start가 배열의 길이보다 작은동안
		while (start < len) {
			// 만약 end가 배열의 길이보다 크면 
			if (end > len) {
			// end의 매개변수로 넘어온 배열의 길이로 대입
				end = len;
			}

			// 부분 문자열 잘라서
			String sub = my_str.substring(start, end); // 0 6 / 6 12 / 12 18 /...

			// 배열에 넣고
			answer[i++] = sub;

			// start, end 변경
			start += n;
			end += n;
		}
		return answer;
	}
}
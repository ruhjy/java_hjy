package codetest.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution120813 {
	public static void main(String[] args) {
//		int n = 15;
//		int n1 = (int)(Math.round(n/2.0));
//		System.out.println(n1);

		Solution10 s = new Solution10();
		System.out.println(Arrays.toString(s.solution(5)));
	}
}

class Solution10 {
	public int[] solution(int n) {

		int[] answer = IntStream.rangeClosed(1, n)
				.filter(i -> i % 2 == 1)
				.toArray();
		return answer;

//		int num = 0;
//		if (n % 2 == 0) {
//			num = n / 2;
//		} else {
//			num = (n / 2) + 1;
//		}
//
//		int[] answer = new int[num];
//		int i = 0;
//
//		for (int j = 1; j <= n; j++) {
//			if (j % 2 != 0) {
//				answer[i] += j;
//				i++;
//			}
//		}
//		return answer;

//      배열을 스트림으로 변환.중복제거.배열로 리턴;
//		return Arrays.stream(answer).distinct().toArray();

	}
}
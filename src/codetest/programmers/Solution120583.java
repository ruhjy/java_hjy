package codetest.programmers;

import java.util.Arrays;

public class Solution120583 {
	public static void main(String[] args) {

		int[] intArr1 = { 1, 1, 2, 3, 4, 5 };
		int[] intArr2 = { 0, 2, 3, 4 };
		Solution7 s = new Solution7();
		System.out.println(s.solution(intArr1, 1));
		System.out.println(s.solution(intArr2, 0));
	}
}

class Solution7 {
	public int solution(int[] array, int n) {
		int answer = 0;
		
		for(int i = 0; i< array.length; i++) {
			if(array[i] != 0) {
				if(array[i] % n == 0) && (array[i] / n == 1)) {
					return answer++;
				}
			} else if(array[i] == 0) {
				answer++;
			}
		}
		return answer;
	}
}
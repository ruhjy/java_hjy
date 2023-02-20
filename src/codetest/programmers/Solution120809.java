package codetest.programmers;

import java.util.Arrays;

public class Solution120809 {
	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
		Solution1 s = new Solution1();
		System.out.println(Arrays.toString(s.solution(intArr)));
	}
}

class Solution1 {
	public int[] solution(int[] numbers) {
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] *= 2;
		}
		return numbers;
	}
}
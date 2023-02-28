package codetest.codingbat;

public class Array2 {
	public int[] fizzArray3(int start, int end) {
		int[] answer = new int[end - start];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = start + i;
		}
		return answer;
	}
}

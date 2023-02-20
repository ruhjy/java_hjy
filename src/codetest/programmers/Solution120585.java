package codetest.programmers;

public class Solution120585 {
	public static void main(String[] args) {
		
		int[] intArr = {180,120,140};
		int he = 190;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(intArr, he));
	}
}


class Solution {
	public int solution(int[] array, int height) {
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > height) {
				answer++;
			}
		}
		
		return answer;
	}
}
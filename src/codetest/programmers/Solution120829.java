package codetest.programmers;

public class Solution120829 {
	
	public int solution(int angle) {

		int answer = 0;
		if (angle < 90) {
			return answer = 1;
		} else if (angle == 90) {
			return answer = 2;
		} else if (angle < 180) {
			return answer = 3;
		} else if (angle == 180) {
			return answer = 4;
		}

		return answer;
	}
	
}

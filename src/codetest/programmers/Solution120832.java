package codetest.programmers;

public class Solution120832 {
	public static void main(String[] args) {

		Solution3 s = new Solution3();
		System.out.println(s.solution(10, 3));

	}
}

class Solution3 {
	public int solution(int n, int k) {
		int answer = 0;
		int food = 12000;
		int drink = 2000;
		
		answer = (food * n) + (drink * k) - ((n / 10) * drink); 
		return answer;
	}
}
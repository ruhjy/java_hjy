package codetest.programmers;

public class Solution120822 {

	public static void main(String[] args) {
		// 01234 
//		  "jaron"
		
		System.out.println(Solution120822.solution("jaron"));

	}

	public static String solution(String my_string) {
		String answer = "";
		
		String[] arr = my_string.split("");
		
		for(int i = 1; i<=arr.length; i++) {
			answer += arr[arr.length-i]; 
		}
		
		return answer;
	}
}

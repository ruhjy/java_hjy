package codetest.programmers;

import java.util.Arrays;

public class Solution120911 {
	public static void main(String[] args) {

		String s1 = solution("Bcad");
		String s2 = solution("heLLo");
		String s3 = solution("Python");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

	public static String solution(String my_string) {
		
		String str = my_string.toLowerCase();
		
		char[] ch1 = str.toCharArray();
		
		Arrays.sort(ch1);
		
//		String answer = String.valueOf(ch1);
		String answer = new String(ch1);
		return answer;
	}
}

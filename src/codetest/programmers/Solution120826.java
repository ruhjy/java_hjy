package codetest.programmers;

public class Solution120826 {
	public static void main(String[] args) {

		System.out.println(solution("abcdef", "f"));
		System.out.println(solution("BCBdbe", "B"));
	}

	public static String solution(String my_string, String letter) {

		String answer = my_string.replace(letter, "");

		return answer;
	}
}

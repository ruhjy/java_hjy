package codetest.programmers;

public class Solution120911 {
	public static void main(String[] args) {

		String s1 = solution("Bcad");
		String s2 = solution("heLLo");
		String s3 = solution("Python");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

//	public static String solution(String my_string) {
//		
//		String str = my_string.toLowerCase();
//		
//		char[] ch1 = str.toCharArray();
//		
//		Arrays.sort(ch1);
//		
////		String answer = String.valueOf(ch1);
//		String answer = new String(ch1);
//		return answer;
//	}
	public static String solution(String my_string) {

		// 소문자로 바꾸기
		String lower = my_string.toLowerCase();

		// 배열로 쪼개기
//		String[] chars = lower.split("");
		char[] chars = lower.toCharArray();

		// 정렬
		java.util.Arrays.sort(chars);

		String answer = "";

		// 연결
		for (char c : chars) {
			answer += c;
		}
//		return new String(chars);
		return answer;
	}
}

package codetest.programmers;

public class Solution120839 {
	public static void main(String[] args) {

//		String s1 = solution("2");
		String s2 = solution("520505025025025");
//		System.out.println(s1);
		System.out.println(s2);

	}

	public static String solution(String rsp) {
//		String answer = "";
//		String result = "";
//		char[] chars = rsp.toCharArray();
//
//		for (int i = 0; i < chars.length; i++) {
//			if (chars[i] == '0') {
//				result = "5";
//			} else if (chars[i] == '2') {
//				result = "0";
//			} else if (chars[i] == '5') {
//				result = "2";
//			}
//			answer += result;
//		}
//
//		return answer;

		String answer = "";
		char[] array = rsp.toCharArray();

		for (char a : array) {
			char w = switch (a) {
				case '0' -> '5';
				case '2' -> '0';
				case '5' -> '2';
				default -> ' ';
			};

			answer += w;
		}

		return answer;
	}
}

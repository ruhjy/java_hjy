package codetest.codingbat;

public class String2 {

	public String doubleChar1(String str) { // 방법1
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i); // T
			result += str.charAt(i); // T
		}

		return result;
	}

	public String doubleChar2(String str) { // 방법2
		String[] strArr = str.split("");
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= 2; j++) {
				answer += strArr[i];
			}
		}
		return answer;
	}

}
package ch03.exercise;

public class CodingBatExample_4 {
	public static void main(String[] args) {
//						 0123
		String string = "code";
		System.out.println(frontBack(string));

	}

	static String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);
		System.out.println(mid);
		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}
}

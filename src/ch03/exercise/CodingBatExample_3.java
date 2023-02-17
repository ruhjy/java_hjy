package ch03.exercise;

public class CodingBatExample_3 {
	public static void main(String[] args) {
		String oK = notString("is not");
		System.out.println(oK);
	}

	static String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}
}

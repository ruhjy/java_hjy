package ch03.exercise;

public class CodingBatExample_5 {
	public static void main(String[] args) {
		String string = front3("html");
		System.out.println(string);
		
	}
	
	static String front3(String str) {
		if (str.equals("")) {
			return str;
		} else if (str.length() < 3) {
			String sub = str.substring(0);
			return sub + sub + sub;
		} else if (str.length() >= 3) {
			String sub = str.substring(0, 3);
			return sub + sub + sub;
		} else {
			return "false";
		}
	}		
}

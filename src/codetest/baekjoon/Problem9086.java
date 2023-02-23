package codetest.baekjoon;

import java.util.Iterator;
import java.util.Scanner;

public class Problem9086 {
	public static void main(String[] args) {
		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB
				""";

		Scanner scan = new Scanner(input);

//		int loop = Integer.valueOf(scan.nextLine());
		int loop = scan.nextInt();
		
		for (int i = 0; i < loop; i++) {
//			String s1 = scan.nextLine();
			String s1 = scan.next();
			char c1 = s1.charAt(0);
			char c2 = s1.charAt(s1.length() - 1);
			String result = "" + c1 + c2;
			System.out.println(result);
		}
	}
}

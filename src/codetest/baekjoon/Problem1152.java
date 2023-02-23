package codetest.baekjoon;

import java.util.Iterator;
import java.util.Scanner;

public class Problem1152 {
	public static void main(String[] args) {
//		String input = "The Curious Case of Benjamin Button"; // 6
//		String input = "The first character is a blank"; // 6
//		String input = "The last character is a blank"; // 6
		String input = "How are you? Good."; // 4

		Scanner scan = new Scanner(input);

		String[] strArr1 = scan.nextLine().split(" ");
		System.out.println(strArr1.length);
	}
}

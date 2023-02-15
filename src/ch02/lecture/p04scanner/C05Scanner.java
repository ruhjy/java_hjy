package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {
	// 백준 1000번
	public static void main(String[] args) {
		String input = "1 2";
//		Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);

		// 코드 작성
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int res = num1 + num2;

		System.out.println(res);
	}
}

package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	// 백준 10950번
	public static void main(String[] args) {
		String inputString = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";

		Scanner scanner = new Scanner(inputString);
//		while (scanner.hasNext()) {
//			int num1 = scanner.nextInt();
//			int num2 = scanner.nextInt();
//			System.out.println(num1 + num2);
//		}

		int loop = scanner.nextInt();

		for (int i = 0; i < loop; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			System.out.println(num1 + num2);
		}
	}
}

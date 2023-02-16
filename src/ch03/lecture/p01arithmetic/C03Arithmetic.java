package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		// 백준 2588번
		String input = """
				472
				385
				""";

		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int a = num2 / 100;
		int b = (num2 % 100) / 10;
		int c = num2 % 10;

		int line3 = c * num1;
		int line4 = b * num1;
		int line5 = a * num1;

		int line6 = line3 + (line4 * 10) + (line5 * 100);

		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);

//		String str1 = scanner.nextLine();
//		String str2 = scanner.nextLine();
//		
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		
//		System.out.println(num1 * (num2 % 10));
//		System.out.println(num1 * (num2 / 10 % 10));
//		System.out.println(num1 * (num2 / 10 / 10));
//		System.out.println(num1 * num2);
	}

}

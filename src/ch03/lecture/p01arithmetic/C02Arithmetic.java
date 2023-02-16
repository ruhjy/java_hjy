package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	public static void main(String[] args) {
		// 백준 1008번
		String input = "1 3";
		
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println(num1 / num2);
	}
}

package ch06.lecture.p09package;

import static java.lang.Math.*;

class C08StaticImportAll {
	public static void main(String[] args) {

//		int num1 = (int) (Math.random() * 6) + 1;
//		int num2 = (int) (Math.random() * 6) + 1;
//		System.out.printf("%d, %d%n", num1, num2);

//		double num1 = Math.floor(Math.random() * 6) + 1;
//		double num2 = Math.floor(Math.random() * 6) + 1;

		double num1 = floor(random() * 6) + 1;
		double num2 = floor(random() * 6) + 1;

		System.out.println((int) num1);
		System.out.println((int) num2);

	}
}

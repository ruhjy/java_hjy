package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {

		String name = "output/print2.txt";

		try (PrintStream ps = new PrintStream(name)) {

			ps.println(12345);
			ps.println("hello");
			ps.println(true);
			ps.println(7.12);
			ps.println("한글");
			ps.println((1 + (1 - 1)) * 10);

			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

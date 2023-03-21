package ch11.lecture.p01exception;

import java.io.*;

public class C07CheckedException {
	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream(".gitignore");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("continue.......");

	}
}

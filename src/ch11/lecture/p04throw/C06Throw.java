package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {

	}

	public static void method2() throws Exception {
		int a = 1;
		if (a == 1) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}

	public static void method1() throws ClassNotFoundException, FileNotFoundException {
		int a = 2;
		if (a == 1) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}

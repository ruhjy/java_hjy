package ch18.lecture.p10file;

import java.io.*;

public class C01File {
	public static void main(String[] args) {
		// File : file 또는 directory에 관한 객체
		File file = new File("src/ch18/lecture/p10file/C01File.java");

		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}
}

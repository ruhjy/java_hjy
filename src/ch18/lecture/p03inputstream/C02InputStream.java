package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {

		try (var is = new FileInputStream("output/test3.db")) {

			int data = 0;

			while ((data = is.read()) != -1) { // 리턴하는 값이 -1이 아닌동안 반복
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

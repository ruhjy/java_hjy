package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("output/test3.db")) {

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array, 1, 3); // 1번 인덱스부터 3개까지만 출력 - 3 bytes

			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

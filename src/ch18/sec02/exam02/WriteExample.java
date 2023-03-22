package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("output/test2.db")) {

			byte[] array = { 10, 20, 30 }; // 3 byte

			os.write(array); // 배열의 모든 바이트를 출력

			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
//			os.close(); // try-with-resource 블럭으로 처리해서 close 생략 가능
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

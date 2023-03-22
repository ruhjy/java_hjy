package ch18.lecture.p02outputstream;

import java.io.*;

public class C06OutputStream {
	public static void main(String[] args) {

		try (var os = new FileOutputStream("output/output6.txt")) { // 12 bytes 파일
			// 한 바이트 쓰기
			os.write(123456); // 1 byte
			os.write(123456789); // 1 byte

			// 여러 바이트 쓰기
			byte[] data = { 3, 1, 0, 127, 64 };
			os.write(data); // 5 byte
			os.write(data); // 5 byte
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

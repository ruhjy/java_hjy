package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {

		try (var os = new FileOutputStream("output/output7_1.txt")) {

			// 1 바이트 쓰기
			os.write(30);
			os.write(192734);

			// 여러 바이트 쓰기
			byte[] data = { 3, 3, 3, 3, 3, 3, 3, 3, 3 }; // 9 bytes
			os.write(data);

			// 여러 바이트 쓰기 (배열의 일부분만)
			os.write(data, 0, 3); // 3 bytes
			os.write(data, 4, 5); // 5 bytes
			os.write(data, 0, data.length); // 9 bytes

			os.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {

		String src = "picture/그림01 참조타입.png";
		String des = "picture/그림01 참조타입_copy.png";

		try (InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(des)) {

			byte[] data = new byte[1024];
			int len = 0;

			while ((len = is.read(data)) != -1) {
				os.write(data, 0, len);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("성공!");

	}
}

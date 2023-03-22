package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {

		String src = "picture/그림04 참조타입.png";
		String des = "picture/그림04 참조타입_copy.png";

		try (InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(des)) {

			is.transferTo(os);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("성공!");

	}
}

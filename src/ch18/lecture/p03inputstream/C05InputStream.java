package ch18.lecture.p03inputstream;

import java.io.*;
import java.util.*;

public class C05InputStream {
	public static void main(String[] args) {

		String src = "picture/그림02 참조타입.png";
		String des = "picture/그림02 참조타입_copy.png";

		try (InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(des)) {

			int data = 0;

			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료!");
	}
}

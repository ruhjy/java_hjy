package ch18.lecture.p03inputstream;

import java.io.*;
import java.util.*;

public class C04InputStream {
	public static void main(String[] args) {

		try (var os = new FileOutputStream("output/test111.txt")) {

			byte[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

			os.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		}

		String name = "output/test111.txt"; // 12 bytes

		try (var is = new FileInputStream(name)) {

			byte[] arr = new byte[5];

			int len = 0;
			while ((len = is.read(arr)) != -1) {
				System.out.println(Arrays.toString(arr));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

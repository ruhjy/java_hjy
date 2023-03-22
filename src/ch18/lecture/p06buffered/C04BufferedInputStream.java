package ch18.lecture.p06buffered;

import java.io.*;

public class C04BufferedInputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";
		try (InputStream fis = new FileInputStream(name);) {

			long start = System.nanoTime();

			while (fis.read() != -1) {
			}

			long end = System.nanoTime();
			System.out.println((end - start) + "ns"); // 1108709000ns

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

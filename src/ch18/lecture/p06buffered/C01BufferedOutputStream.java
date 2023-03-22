package ch18.lecture.p06buffered;

import java.io.*;

public class C01BufferedOutputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";
		try (OutputStream fis = new FileOutputStream(name);
				OutputStream os = new BufferedOutputStream(fis)) {

			long start = System.nanoTime();

			for (int i = 0; i < 1000000; i++) {
				os.write(1);
			}

			os.flush();

			long end = System.nanoTime();
			System.out.println((end - start) + "ns"); // 10615200ns

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

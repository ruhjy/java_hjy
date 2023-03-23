package ch18.lecture.p09filter;

import java.io.*;

public class C02Filter {
	public static void main(String[] args) {

		String fileName = "output/byte1.txt";

		try (
				FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				OutputStreamWriter osw = new OutputStreamWriter(bos)) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

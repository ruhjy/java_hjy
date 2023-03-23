package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) {

		String name = "output/byte1.txt";
		try (OutputStream os = getOutput(name);
				OutputStreamWriter osw = new OutputStreamWriter(os)) {

			osw.write('a');
			osw.write('b');
			osw.write('한');
			osw.write('글');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(fileName);
		return os;
	}
}

package ch18.exercise.exam10;

import java.io.*;

public class Example {
	public static void main(String[] args) {

		String dirs = "C:/Temp/dir1";
		String origin = "C:/Temp/dir1/photo1.jpg";
		String copy = "C:/Temp/dir1/photo2.jpg";

		File dir = new File(dirs);
		File file1 = new File(origin);
		File file2 = new File(copy);

		if (dir.exists() == false) {
			dir.mkdirs();
		}

		if (file1.exists() == false) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (file2.exists() == false) {
			createCopy(origin, copy);
		}

	}

	private static void createCopy(String origin, String copy) {
		try (
				OutputStream os = new FileOutputStream(origin);
				InputStream is = new FileInputStream(copy);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				InputStreamReader isr = new InputStreamReader(is)) {

			char[] data = new char[1024];
			int read = 0;
			while ((read = isr.read(data)) != -1) {
				osw.write(data, 0, read);
			}

			osw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

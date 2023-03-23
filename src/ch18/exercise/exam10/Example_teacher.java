package ch18.exercise.exam10;

import java.io.*;

public class Example_teacher {
	public static void main(String[] args) {

		// 파일명 입력 받는 코드(option)
		String origin = "";
		String copy = "";

		try (
				BufferedInputStream bis = new BufferedInputStream(System.in);
				InputStreamReader isr = new InputStreamReader(bis);) {

			char[] inputFileCharArray = new char[1024];
			System.out.print("원본 파일 경로:");
			int len = isr.read(inputFileCharArray);

			origin = new String(inputFileCharArray, 0, len);
			origin = origin.strip();

			System.out.print("복사할 파일 경로:");
			len = isr.read(inputFileCharArray);

			copy = new String(inputFileCharArray, 0, len);
			copy = copy.strip();

//			System.out.println(origin);
//			System.out.println(copy);

			File file = new File(origin);
			if (!file.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다.");
				return;
			}

			int lastSlashIndex = copy.lastIndexOf("/");
			String copyFolder = copy.substring(0, lastSlashIndex);
			File file2 = new File(copyFolder);
			if (!file2.exists()) {
				file2.mkdirs();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 복사하는 코드 작성
		try (InputStream is = new FileInputStream(origin);
				OutputStream os = new FileOutputStream(copy);

				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {

			byte[] data = new byte[1024];
			int len = 0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}

			bos.flush();

			System.out.println("복사가 성공되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

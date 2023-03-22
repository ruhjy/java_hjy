package ch18.lecture.p02outputstream;

import java.io.*;

public class C04Close {
	public static void main(String[] args) throws FileNotFoundException {

		// try-with-resources 에 사용하는 코드가 복잡할 경우
		// try 밖으로 뺄 수 있음
		OutputStream os = new FileOutputStream("");
		OutputStream os2 = new FileOutputStream("");
		OutputStream os3 = new FileOutputStream("");

		try (os; os2; os3) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

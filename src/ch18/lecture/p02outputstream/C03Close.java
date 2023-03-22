package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		// try-with-resources

		// 자동으로 닫아줌 - AutoCloseable 인터페이스를 구현한 클래스만 가능, close() 메서드 오버라이딩
		try (OutputStream os = new FileOutputStream("")) {
			
			os.write(1);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

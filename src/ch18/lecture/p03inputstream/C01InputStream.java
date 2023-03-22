package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		// InputStream
		// byte 단위 입력 스트림
		// 주요 메서드 : read()

		String name = "output/test3.db"; // 3 bytes 크기 파일
		try (InputStream is = new FileInputStream(name)) {
			// read : 1 바이트 읽기
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read()); // 예외 없이 프로그램 정상 종료 -1 리턴
			System.out.println(is.read());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}

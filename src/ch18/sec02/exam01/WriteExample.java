package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {

		try {
													// 도착지/파일명
			OutputStream os = new FileOutputStream("output/test1.db");

			byte a = 10;
			byte b = 20;
			byte c = 30;

			// 1 byte씩 출력
			os.write(a);
			os.write(b);
			os.write(c);

			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움.
			os.close(); // 출력 스트림을 닫아 사용한 메모리를 해제.

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("정상 종료");
	}
}

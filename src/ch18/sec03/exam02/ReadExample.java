package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {

		// 데이터 출발지를 test.db로 하는 입력 스트림 생성
		try (InputStream is = new FileInputStream("output/test2.db")) {

			byte[] data = new byte[100];

			while (true) {
				// 최대 100byte를 읽고, 읽은 바이트는 data 저장, 읽은 수는 리턴
				int num = is.read(data);
				// 파일 끝에 도달했을 경우 반복문 종료
				if (num == -1)
					break;

				for (int i = 0; i < num; i++) {
					System.out.println(data[i]); // 읽은 바이트 출력
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

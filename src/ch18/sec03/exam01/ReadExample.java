package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {

		// 데이터 출발지를 test1.db로 하는 입력 스트림 생성
		try (InputStream is = new FileInputStream("output/test1.db")) {

			while (true) {
				int data = is.read(); // 1 byte씩 읽기

				if (data == -1) break; // 파일 끝에 도달했을 경우 반복문 종료
					
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

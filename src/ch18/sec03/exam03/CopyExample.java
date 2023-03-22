package ch18.sec03.exam03;

import java.io.*;
import java.util.*;

public class CopyExample {
	public static void main(String[] args) throws IOException {

		String originalFileName = "picture/그림03 참조타입.png";
		String targetFileName = "picture/그림03 참조타입_copy.png";

		// 입출력 스트림 생성
		var is = new FileInputStream(originalFileName);
		var os = new FileOutputStream(targetFileName);

		byte[] data = new byte[1024]; // 읽은 바이트를 저장할 배열 생성
		while (true) {
			// 최대 1024바이트 읽고 배열에 저장, 읽은 바이트는 리턴
			int num = is.read(data);
			if (num == -1) // 파일을 다 읽으면 while 문 종료
				break;
			os.write(data, 0, num); // 읽은 바이트 수만큼 출력

		}

		os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		os.close();
		is.close();

		System.out.println("복사가 잘 되었습니다.");
	}
}

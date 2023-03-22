package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		// 이전 값으로 남아있는다.

		// 읽을 파일 크기 : 3 bytes
		try (var is = new FileInputStream("output/test2.db")) {
			byte[] data = new byte[5]; // {0, 0, 0, 0, 0}

			Arrays.fill(data, (byte) 1); // 배열을 1로 채우는 코드

			System.out.println(Arrays.toString(data));
			is.read(data);
			System.out.println(Arrays.toString(data));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

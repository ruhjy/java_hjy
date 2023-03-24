package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C06Server2 {
	public static void main(String[] args) {

		int port = 50500;

		try (
				ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				InputStreamReader isr = new InputStreamReader(bis)) {
			while (true) {
				System.out.println("연결 기다리는 중...");
				Thread t = new Thread(() -> {
					char[] data = new char[1024];
					int len = 0;

					System.out.println("입력 받는 중...");

					try {
						while ((len = isr.read(data)) != -1) {
							String input = new String(data, 0, len);
							System.out.println(input);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}

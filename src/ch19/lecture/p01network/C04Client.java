package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {

		// ip 주소
		String ip = "172.30.1.96";
		// port 번호
		int port = 50500;

		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos)) {
			
			ps.println("hello server, I am heo");

			ps.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 종료");

	}
}

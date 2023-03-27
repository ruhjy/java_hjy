package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {

		int port = 80;

		try (ServerSocket serversocket = new ServerSocket(port)) {

			while (true) {
				System.out.println("요청 기다리는 중...");
				Socket socket = serversocket.accept();
				
				Thread t = new Thread(() -> {
					try (
							socket;
							OutputStream os = socket.getOutputStream();
							PrintStream ps = new PrintStream(os)) {

						String body = """
								<html>
								<head><title>hi</title><head>
									<body>
										<h1>This is NAVER??</h1>
										<h3>다른 사이트로 이동<h3>
										<ul>
											<li><a href="https://www.daum.net">daum</a></li>
											<li><a href="https://www.google.com">google</a></li>
										</ul>
										<table>
											<tr>
												<th>ㅎㅇ</th>
												<th>ㅂㅇ</th>
											</tr>
											
											<tr>
												<td>hello</td>
												<td>world</td>
											</tr>
											
											<tr>
												<td>real</td>
												<td>world</td>
											</tr>
										</table>
									</body>
								</html>
								""";

						int length = body.getBytes().length;

						// 첫 줄
						ps.println("HTTP/1.1 200 OK");

						// 두번째 줄부터 헤더들
						ps.println("Content-Type : text/html; charset=utf-8");
						ps.println("Content-length " + length);

						// 빈 줄
						ps.println();

						// 응답 본문
						ps.println(body);

						ps.flush();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				t.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

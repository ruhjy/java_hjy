package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws IOException {

		String name = "src/ch18/sec07/exam02/ReadLineExample.java";
		BufferedReader br = new BufferedReader(new FileReader(name));

		int lineNo = 1;
		while (true) {
			String str = br.readLine();
			if (str == null)
				break; // 더 이상 읽을 내용이 없으면 while문 종료
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close(); // BufferedReader를 닫으면 연결된 FileReader도 닫힘
	}
}
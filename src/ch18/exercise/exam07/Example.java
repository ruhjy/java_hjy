package ch18.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		// 확인문제 7
		// filePath 값
		String filePath = "src/ch18/exercise/exam07/Example.java";

		try (FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr)) {

			int rowNumber = 0;
			String rowData;

			while ((rowData = br.readLine()) != null) {
				rowNumber++;
//				System.out.println(rowNumber + "\t" + rowData);
				System.out.println(rowNumber + ": " + rowData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

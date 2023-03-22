package ch18.lecture.p05reader;

import java.io.*;
import java.util.*;

public class C02Reader {
	public static void main(String[] args) {

		String name = "output/writer2.txt";

		try (Reader rd = new FileReader(name)) {
			System.out.println((char) rd.read());
			System.out.println((char) rd.read());
			System.out.println((char) rd.read());

			char[] data = new char[5];

			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));
			rd.read(data);
			System.out.println(Arrays.toString(data));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

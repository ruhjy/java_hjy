package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		
		// IntStream
		IntStream stream1 = IntStream.range(0, 10); // 0 ~ 9
		long count1 = stream1.count();
		System.out.println("count1 : " + count1);
		
		IntStream stream2 = IntStream.rangeClosed(0, 10); // 0 ~ 10
		long count2 = stream2.count();
		System.out.println("count2 : " + count2);
		
	}
}

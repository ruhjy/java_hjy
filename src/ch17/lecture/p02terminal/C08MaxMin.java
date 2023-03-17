package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C08MaxMin {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 9, 0, 2, 4, 5 };
		IntStream stream = Arrays.stream(arr);
//		int max = Arrays.stream(arr)
//				.max()
//				.getAsInt();
//		.get();
		System.out.println("max : " + max);

		int min = Arrays.stream(arr)
				.min()
				.getAsInt();
		System.out.println("min : " + min);
		
		IntStream.of(8, 1, 2)
			.max()
			.getAsInt();
	}
}

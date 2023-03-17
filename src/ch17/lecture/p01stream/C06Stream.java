package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C06Stream {
	public static void main(String[] args) {

		// 원소가 참조타입인 스트림
		Stream<String> stream1 = Stream.of("java", "spring", "css");

		// 원소가 기본타입인 스트림
		IntStream stream2 = IntStream.of(3, 9, 10, 1);
		LongStream stream3 = LongStream.of(9, 10, 11, 2);
		DoubleStream stream4 = DoubleStream.of(3.14, 9.8, 7.1, 12.12);

		int[] intarr = { 9, 10, 11, 12 };
		IntStream stream5 = Arrays.stream(intarr);
//		Stream<Integer> stream6 = Arrays.stream(intarr); // xx

	}
}

package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C02Stream {
	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(9, 8, 7, 1, 2, 3);
		long count = stream1.count();
		System.out.println("count : " + count);

		Stream<Integer> stream2 = Stream.of(9, 8, 7, 1, 2, 3);
//		Optional<Integer> max = stream2.max(Math::max);
//		System.out.println("max : " + max);
		Optional<Integer> max = stream2.max(Integer::compareTo);
		System.out.println("max : " + max);
		System.out.println("max : " + max.get());
		System.out.println();

//		Stream<Integer> stream3 = Stream.of(9, 8, 7, 1, 2, 3);
//		long count2 = stream3.filter(i -> i >5).count();
//		System.out.println("count2 : " + count2);

	}
}

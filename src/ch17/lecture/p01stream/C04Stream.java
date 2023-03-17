package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C04Stream {
	public static void main(String[] args) {

		// collection -> stream
		Collection<Integer> set = Set.of(9, 2, 1, 10, 20, 90, 0, 3);
		Stream<Integer> stream1 = set.stream();

		long count = stream1.count();
		System.out.println("count : " + count);

		Stream<Integer> stream2 = set.stream();
		Optional<Integer> max = stream2.max(Integer::compareTo);
		System.out.println("max : " + max.get());

		Stream<Integer> stream3 = set.stream();
		Optional<Integer> min = stream3.min(Math::min);
		System.out.println("min : " + min.get());

	}
}

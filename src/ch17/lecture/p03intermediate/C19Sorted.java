package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {

		// IntStream -> Stream<Integer> 변환
		
		IntStream.range(1, 6)
				.boxed()
				.sorted((a, b) -> b - a)
				.forEach(System.out::println);
		System.out.println();

		IntStream.range(1, 6)
				.mapToObj(s -> Integer.valueOf(s))
				.sorted((o1, o2) -> Integer.compare(o2, o1))
				.forEach(System.out::println);
		System.out.println();

		IntStream.range(1, 6)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

	}
}

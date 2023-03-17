package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {

		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);
//		List<Integer> list = List.of();

		long max = list.stream()
//				.max((x, y) -> x - y)
				.max(Integer::compare) // max((x, y) -> Integer.compare(x, y))
				.get();
//				.orElse(0);
		System.out.println("max : " + max);

		long min = list.stream()
				.min(Integer::compareTo) // min((x, y) -> x.compareTo(y))
				.get();
		System.out.println("min : " + min);
	}
}

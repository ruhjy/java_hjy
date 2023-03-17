package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

import codetest.codingbat.*;

public class C09Reduce {
	public static void main(String[] args) {

		List<Integer> list = List.of(9, 1, 2, 3, 5);

		Integer sum = list.stream()
				.reduce((a, b) -> a + b)
				.get();
		System.out.println(sum);

		Integer max = list.stream()
//				.reduce((a, b) -> Math.max(a, b))
				.reduce(Math::max)
				.get();
		System.out.println(max);

		Integer min = list.stream()
//				.reduce((a, b) -> Math.min(a, b))
				.reduce(Math::min)
				.get();
		System.out.println(min);

	}
}

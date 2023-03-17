package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C02Terminal {
	public static void main(String[] args) {
		// count
		IntStream stream1 = IntStream.range(0, 100); // 0 ~ 99
		long count1 = stream1.count();
		System.out.println("count1 : " + count1);

		List<String> list = List.of("java", "spring", "css");
		Stream<String> stream2 = list.stream();
		long count2 = stream2.count();
		System.out.println("count2 : " + count2);

		long count3 = list.stream().count();
		System.out.println("count3 : " + count3);

		long count4 = list.stream()
				.map(s -> s + s)
				.filter(s -> s.startsWith("c"))
				.count();
		System.out.println("count4 : " + count4);
	}
}

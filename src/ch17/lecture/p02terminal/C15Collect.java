package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C15Collect {
	public static void main(String[] args) {
		// Collectros.groupingBy()
		// 3 -> css, jsp : 4 -> java, html
		List<String> list = List.of("java", "css", "html", "jsp");

		Map<Integer, List<String>> r1 = list.stream()
				.collect(Collectors.groupingBy(s -> s.length()));

		r1.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

//		System.out.println(r1);

		Map<Integer, List<String>> r2 = new HashMap<>();

//		"java", "css", "html", "jsp"
		for (String s : list) {
			Integer key = s.length();
			List<String> val = r2.get(key);
			if (val == null) {
				val = new ArrayList<>();
				r2.put(key, val);
			}
			val.add(s);
		}
		System.out.println(r2);
	}
}

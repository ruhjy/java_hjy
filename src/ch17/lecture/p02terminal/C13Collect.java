package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C13Collect {
	public static void main(String[] args) {

		List<Integer> list = List.of(3, 2, 3, 2, 2, 2);

		// collect ( 객체 , (객체 , stream원소), 객체 합치기)
		Map<Integer, Integer> r1 = list.stream()
				.collect(() -> new HashMap<>(),
						(map, e) -> map.compute(e, (k, v) -> v == null ? 1 : v + 1),
						(a, b) -> a.putAll(b));

//				.collect(HashMap::new, 
//						(map, e) -> map.compute(e, (k, v) -> v == null ? 1 : v + 1),
//						Map::putAll);
		System.out.println("r1 : " + r1);

	}
}

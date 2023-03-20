package ch17.lecture.p03intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {

		// map: 매핑(변환)
		List<Integer> list = List.of(2, 1, 0, 3, 9);

		System.out.println("0으로 매핑 #####");
		list.stream()
				.map(s -> 0)
				.forEach(n -> System.out.print(n + " ")); // 0, 0, 0, 0, 0
		System.out.println();

		System.out.println(list);
		System.out.println("*2(짝수)로 매핑 #####");
		list.stream()
				.map(e -> e * 2)
				.forEach(n -> System.out.print(n + " ")); // 4, 2, 0, 6, 18

	}
}
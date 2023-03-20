package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		// flatMap :
		// 원래 원소를 다른 원소 '들'로 매핑
		List<Integer> list = List.of(3, 4, 5);

		// map : 1 대 1
		long count = list.stream()
				.map(e -> e)
				.count();
		System.out.println("count : " + count);

		// flatMap : 1 대 다(多)
		long count2 = list.stream()
				.flatMap(e -> Stream.of(e + 10, e + 20, e + 30))
				.count();
		System.out.println("count2 : " + count2);
		System.out.println();

		list.stream()
				.flatMap(e -> Stream.of(e + 10, e + 20, e + 30))
				.forEach(System.out::println);
	}
}

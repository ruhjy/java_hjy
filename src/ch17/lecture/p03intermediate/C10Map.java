package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C10Map {
	public static void main(String[] args) {

		List<String> list = List.of("java", "css", "spring", "html");

		Stream<String> stream1 = list.stream();

		// 다른 타입으로 매핑
		// map(String -> Integer)
		Stream<Integer> stream2 = stream1.map(s -> s.length());

		stream2.forEach(System.out::println);

		System.out.println("짝수 길이 스트링의 몇개인지 출력 #####");
		long count = list.stream()
//				.map(s -> s.length())
				.map(String::length)
				.filter(i -> (i % 2) == 0)
				.count();
		System.out.println("count : " + count);
	}
}

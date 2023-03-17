package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {

		List<String> list = List.of("java", "css", "html", "jsp");

		Integer sum = list.stream().map(e -> e.length()).reduce((a, b) -> a + b).get();
		System.out.println(sum);

		// Integer sum1 = list.stream().mapToInt(String::length).reduce((a,b) ->
		// a+b).getAsInt();
		// Integer sum2 = list.stream().mapToInt(String::length).sum();
		// System.out.println("sum1 : " + sum1);
		// System.out.println("sum2 : " + sum2);
	}
}

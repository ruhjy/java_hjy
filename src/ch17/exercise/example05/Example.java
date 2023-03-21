package ch17.exercise.example05;

import java.util.*;
import java.util.function.*;

public class Example {
	public static void main(String[] args) {

		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		for (String s : list) {
			if (s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		System.out.println();

		list.stream()
//				.filter(s -> Example.havingJava(s))
				.filter(Example::havingJava)
				.forEach(i -> System.out.println(i));

	}

	public static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}

}

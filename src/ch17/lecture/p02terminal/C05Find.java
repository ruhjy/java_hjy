package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {

		// findFirst
		// findAny

		// Optional<T>
		Optional<String> o1 = Optional.of("java");
		System.out.println(o1.isPresent()); // true
		System.out.println(o1.isEmpty()); // false
		String s1 = o1.get();
		System.out.println(s1); // "java"

		String s2 = o1.orElse("default");
		System.out.println(s2); // "java"
		System.out.println();

		Optional<String> o2 = Optional.ofNullable(null);
//		Optional<String> o2 = Optional.ofNullable("java");
		System.out.println(o2.isPresent()); // false
		System.out.println(o2.isEmpty()); // true
//		String s3 = o2.get();
//		System.out.println(o3);
		String s4 = o2.orElse("default");
		System.out.println(s4); // "default"

	}
}

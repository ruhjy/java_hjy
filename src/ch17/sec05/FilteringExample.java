package ch17.sec05;

import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");

		// 중복 요소 제거
		list.stream()
				.distinct()
				.forEach(n -> System.out.println(n));
		System.out.println();

		// 신으로 시작하는 요소만 필터링
		list.stream()
				// String의 startsWith() 메서드는 주어진 문자열으로
				// 시작하면 true, 그렇지 않으면 false
				.filter(n -> n.startsWith("신")) 
				.forEach(n -> System.out.println(n));
		System.out.println();

		// 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
				.distinct()
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
	}
}

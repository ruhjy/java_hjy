package ch15.lecture.p01list;

import java.util.*;

class C02List {
	public static void main(String[] args) {

		// list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");

		// for
		System.out.println("for#############");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// 향상된 for 문
		System.out.println("향상된 for@@@@@@@@@@");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		// Iterator
		System.out.println("Iterator &&&&&&&&&&");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		// forEach() - (Consumer)
		System.out.println("forEach **********");
		list.forEach(l -> System.out.println(l));
		System.out.println();
		
		// forEach() - (Consumer) - 메서드 참조
		System.out.println("forEach **********");
		list.forEach(System.out::println);

	}
}

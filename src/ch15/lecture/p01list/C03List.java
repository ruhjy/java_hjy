package ch15.lecture.p01list;

import java.util.*;

import ch05.sec09.*;

class C03List {
	public static void main(String[] args) {

		// List
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");

		// List의 List
		List<List<String>> list2 = new ArrayList<>();
		var list3 = new ArrayList<List<String>>();

		list2.add(new ArrayList<>());
		list2.add(new ArrayList<>());

		System.out.println(list2.get(0).size());
		System.out.println(list2.get(1).size());
		System.out.println();

		list2.get(0).add("java");
		list2.get(0).add("spring");

		list2.get(1).add("css");
		list2.get(1).add("html");
		list2.get(1).add("js");

		// 전체 탐색
		// for
		System.out.println("for#############");
		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j));
			}
		}
		// 향상된 for 문
		System.out.println("향상된 for@@@@@@@@@@");
		for (List<String> list : list2) {
			for (String item : list) {
				System.out.println(item);
			}
		}

		// forEach() - (Consumer)
		System.out.println("forEach **********");
		list2.forEach(list -> list.forEach(item -> System.out.println(item)));
		// forEach() - (Consumer) - 메서드 참조
		System.out.println("forEach **********");
		list2.forEach(list -> list.forEach(System.out::println));
	}
}

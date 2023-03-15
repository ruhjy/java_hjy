package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {

		// set : 순서없음, 중복안됨
		Set<Integer> set = new HashSet<>();

		// add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(90); // 중복
		set.add(7);
		set.add(3); // 중복

		// size() : 크기
		int size = set.size();
		System.out.println("size = " + size);
		System.out.println(set);

		// remove() : 삭제
		set.remove(3);
		System.out.println("size = " + set.size());
		System.out.println(set);
		System.out.println("\n");
		// 전체 탐색
		System.out.println("향상된 for문 #############");
		for (Integer e : set) {
			System.out.println(e);
		}

		System.out.println("Iterator $$$$$$$$$$$$$$$$$");
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("forEach() %%%%%%%%%%%%%%%");
		set.forEach(s -> System.out.println(s));
		System.out.println("forEach() - 메서드 참조%%");
		set.forEach(System.out::println);
	}
}

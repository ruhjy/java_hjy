package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator {
	public static void main(String[] args) {

		// iterator
		// collection 탐색을 위한 객체의 타입
		// hasNext : 다음 탐색할 원소가 있는지? boolean 리턴
		// next : 다음 원소 리턴

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		System.out.println(set);
		System.out.println();

		// remove : 특정 원소 지우기

		// 조건에 따라 원소 지우기

		// 향상된 for문 사용시 set이 변경되면 exception 발생
		// java.util.ConcurrentModificationException
//		for (String e : set) {
//			if (e.length() % 2 == 0) {
//				set.remove(e);
//			}
//		}
//		System.out.println();

		// 따라서 지우는 목적으로 탐색한다면 Iterator.remove() 사용
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String n = iter.next();
			if ((n.length() % 2) == 0) {
				iter.remove();
			}
		}
		System.out.println(set);

	}
}

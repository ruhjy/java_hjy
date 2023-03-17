package ch17.lecture.p02terminal;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 9, 8, 7);

		// collect ( 객체 , (객체 , stream원소), 객체 합치기)
		List<Integer> r1 = list.stream()
				.collect(() -> new ArrayList<>(), (a, b) -> a.add(b), (a, b) -> a.addAll(b));
//				.collect(ArrayList::new, List::add, List::addAll);
		System.out.println("r1 : " + r1);
	}
}

package ch17.lecture.p02terminal;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		// match
		// allMatch
		// anyMatch
		// noneMatch
		// 리턴타입 : boolean

		List<Integer> list = List.of(3, 5, 7, 9, 10);
		
		boolean allMatch = list.stream().allMatch(e -> e > 0);
		System.out.println("allMatch : " + allMatch);
		
		boolean anyMatch = list.stream().anyMatch(e -> e < 0);
		System.out.println("anyMatch : " + anyMatch);
		
		boolean noneMatch = list.stream().noneMatch(e -> e < 0);
		System.out.println("noneMatch : " + noneMatch);

	}
}

package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);

		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.distinct();

//		list.add(2);
		// 최종연산 실행시 중간연산이 한번에 실행됨
		long count = stream2.count();
		System.out.println("count : " + count);

	}
}

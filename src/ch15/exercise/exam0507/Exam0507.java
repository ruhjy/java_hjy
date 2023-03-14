package ch15.exercise.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = { 1, 5, 3, 8, 2 };
//		List<Integer> list = new ArrayList<>();

		// of() : 수정 불가 리스트 리턴 Immutable
		// Returns an unmodifiable list
		List<Integer> list = List.of(1, 5, 3, 8, 2);

		// 위 리스트에서 최대값 구하는 코드 작성
//		int max = list.get(0);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println("max : " + max);

		for (int i : list) {
			if (max < i)
				max = i;
		}
		System.out.println("max : " + max);

		for (Integer e : list) {
			max = Math.max(max, e);
		}
		System.out.println("max : " + max);

	}
}

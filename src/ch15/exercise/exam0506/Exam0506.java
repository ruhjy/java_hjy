package ch15.exercise.exam0506;

import java.util.*;

public class Exam0506 {
	public static void main(String[] args) {

		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		System.out.println(array.length); // 3
		System.out.println(array[2].length); // 5
		System.out.println("--------------------------");

		List<Integer> list1 = List.of(95, 86);
		List<Integer> list2 = List.of(83, 92, 96);
		List<Integer> list3 = List.of(78, 83, 93, 87, 88);

		List<List<Integer>> listk = new ArrayList<>();
		listk.add(list1);
		listk.add(list2);
		listk.add(list3);
		System.out.println(listk.size());
		System.out.println(list3.size());

		System.out.println(listk);

	}
}

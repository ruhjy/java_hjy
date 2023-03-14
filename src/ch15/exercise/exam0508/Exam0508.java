package ch15.exercise.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {

//		int[][] array = {
//				{ 95, 86 },
//				{ 83, 92, 96 },
//				{ 78, 83, 93, 87, 88 }
//		};

		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));

		// 문제6
		System.out.println(list.size()); // 3
		System.out.println(list.get(2).size()); // 5

		// 문제 8
		// 합, 평균 구하기
		double score = 0;
		double avg = 0;
		int count = 0;
		for (List<Integer> i : list) {
			for (Integer j : i) {
				score += j;
				count++;
			}
		}
		avg = score / count;
		System.out.println("count : " + count);
		System.out.println("총합 : " + score);
		System.out.println("평균 : " + avg);

	}
}

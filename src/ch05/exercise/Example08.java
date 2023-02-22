package ch05.exercise;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example08 {
	public static void main(String[] args) {

		// 2차원 배열 생성
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		// 배열 항목의 전체 합과 평균 변수 선언과 초기화
		int rowSum = 0;
		int totalSum = 0;
		double totalAvg = 0;

		// 중첩 for문
		for (int i = 0; i < array.length; i++) {
			rowSum += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				totalSum += array[i][j];
			}
		}

		// 평균 계산과 출력
		totalAvg = (double) totalSum / rowSum;
		System.out.println("항목의 전체 합 : " + totalSum);
		System.out.println("항목의 평균 : " + totalAvg);
	}
}

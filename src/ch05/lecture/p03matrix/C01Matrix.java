package ch05.lecture.p03matrix;

import java.util.Arrays;

public class C01Matrix {
	public static void main(String[] args) {
		// 2차원 배열 (행렬)

		int[][] arr = new int[3][];

		System.out.println(arr.length);
		System.out.println(Arrays.deepToString(arr));

		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 2, 4, 8, 10 };
		arr[2] = new int[] { 9, 10, 11, 12 };

		System.out.println();
		System.out.println(arr[0][0]); // 1
		System.out.println(arr[1][1]); // 4
		System.out.println(arr[1][2]); // 8
		System.out.println(arr[2][3]); // 12
		System.out.println();
		System.out.println(Arrays.deepToString(arr));

		System.out.println("전체탐색 for");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr));
	}
}

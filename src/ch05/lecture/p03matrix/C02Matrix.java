package ch05.lecture.p03matrix;

import java.util.Arrays;

public class C02Matrix {
	public static void main(String[] args) {

		int[][] mat = new int[3][4]; // 3행 4열

		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);
		System.out.println();

//		System.out.println(Arrays.deepToString(mat));
//		System.out.println(Arrays.toString(mat[0]));
//		System.out.println(Arrays.toString(mat[1]));
//		System.out.println(Arrays.toString(mat[2]));

		System.out.println("전체 탐색");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
		System.out.println();

		// 각 원소에 값 할당
		mat[0][0] = 3;
		mat[0][1] = 5;
		mat[0][2] = 7;
		mat[0][3] = 9;

		// .....

		mat[2][1] = 10;
		mat[2][2] = 20;
		System.out.println("전체 탐색");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
		System.out.println();
	}
}

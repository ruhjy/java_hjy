package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {

		// 책 188쪽
		int[] origin = { 9, 8, 1, 2, 3 };
		int[] target = new int[origin.length];

//		System.arraycopy
//		(Object src, 원본배열
//		int srcPos,  원본배열에서의 복사할 시작 인덱스
//		Object dest, 복사배열
//		int destPos, 복사배열에서의 복사할 시작 인덱스
//		int length); 시작 인덱스부터의 길이(갯수)
		System.arraycopy(origin, 2, target, 0, 3);
		System.out.println(Arrays.toString(origin)); // [9, 8, 1, 2, 3]
		System.out.println(Arrays.toString(target)); // [1, 2, 3, 0, 0]
		System.out.println();

		origin[0] = 99;
		System.out.println(Arrays.toString(origin)); // [99, 8, 1, 2, 3]
		System.out.println(Arrays.toString(target)); // [1, 2, 3, 0, 0]

	}
}

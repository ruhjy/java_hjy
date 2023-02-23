package ch05.lecture.p05null;

import java.util.Arrays;

public class C01Null {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2 };
		arr1 = null; // 참조하는 객체 없음
		int[] arr2 = arr1;

		// 참조하는 객체없음 예외 발생(java.lang.NullPointerException)
		int len = arr1.length; 

	}
}

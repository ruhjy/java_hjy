package ch05.lecture.p01array;

public class C05Array {
	public static void main(String[] args) {

		int[] arr1;
		arr1 = new int[3];

		int[] arr2 = new int[3];

		int[] arr3;
		arr3 = new int[] { 3, 4, 5 };

		int[] arr4 = new int[] { 3, 4, 5 };

		// 타입 선언 시 초기값 할당 할 때 new 타입명 생략 가능
		int[] arr5 = { 3, 4, 5 };

		int[] arr6;
//		arr6 = { 3, 4, 5 }; // 문법 오류
		arr6 = new int[] { 3, 4, 5 };
	}
}

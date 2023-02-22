package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {

		int[] arr = { 3, 4, 5 };

		method1(arr);
		System.out.println("arr[0] = " + arr[0]); // 30
	}

	// int[] arr2 = arr;
	public static void method1(int[] arr2) { // 참조형 매개변수
		System.out.println(arr2[0]);
		arr2[0] = 30;
		System.out.println(arr2[0]);
	}
}

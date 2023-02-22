package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6 };

		int[] arr2 = arr;

		System.out.println(arr2[0]);

		arr = new int[] { 2, 4, 6 };
//		arr = new int[] { 3, 5, 7 };

		System.out.println(arr[0]);
		arr[0] = 20;
		System.out.println(arr[0]);
		System.out.println();

		System.out.println("arr2[0] = " + arr2[0]); // 2
	}
}

package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {

		int[] arr1 = { 5, 6, 10, 9, 1, 2 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// enhanced for, (향상된 for), foreach
		for (int a : arr1) {
			System.out.println(a);
		}

	}
}

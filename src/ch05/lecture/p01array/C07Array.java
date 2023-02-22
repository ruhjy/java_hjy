package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {

		int a = 3;
		int b;

		b = a;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();

		a = 6;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		
		int[] arr1 = { 5, 6, 7 };
		int[] arr2;

		arr2 = arr1;
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println();
		
		arr1[0] = 50;
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println();
		
	}
}

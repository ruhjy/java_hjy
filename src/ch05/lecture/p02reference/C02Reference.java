package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {

		int a = 3;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		a = 6;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		int[] arr1 = { 5, 6, 7 };
		int[] arr2 = arr1;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println();
		
		arr1[0] = 99;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
	}
}

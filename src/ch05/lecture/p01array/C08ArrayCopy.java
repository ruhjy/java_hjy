package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {

		int[] arr1 = { 3, 4, 5 };
//		arr1[3] = 9; // 실행 중 오류(runtime exception)

		System.out.println("다음 실행 흐름.");

		int[] arr2 = { 10, 20, 30 };
		int[] arr3 = new int[arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			arr3[i] += arr2[i];
		}
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println();
		
		System.out.println("arr3[0] : " + arr3[0]);
		System.out.println("arr3[1] : " + arr3[1]);
		System.out.println("arr3[2] : " + arr3[2]);
		System.out.println();
		
		arr2[0] = 100;
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr3[0] : " + arr3[0]);
	}
}

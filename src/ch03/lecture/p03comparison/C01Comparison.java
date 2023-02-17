package ch03.lecture.p03comparison;

public class C01Comparison {
	public static void main(String[] args) {
		// 비교 연산자
		// ==, !=, <, <=, >, >=
		
		// 연산결과는 boolean
		
		int x = 3;
		int y = 5;
		
		boolean r1 = x == y; // false
		boolean r2 = x != y; // true
		System.out.printf("%b, %b%n", r1, r2);
		System.out.println();
		
		boolean r3 = x < y; // true
		boolean r4 = x <= y; // true
		System.out.printf("%b, %b%n", r3, r4);
		System.out.println();
		
		boolean r5 = x > y; // false
		boolean r6 = x >= y; // false
		System.out.printf("%b, %b%n", r5, r6);
		System.out.println();
		
		// 같은 타입끼리 비교해야함
		int a = 30;
		String b = "50";
		boolean c = true;
		
//		boolean r7 = a < b; // 다른 타입 비교 불가
//		boolean r8 = a < c;
		
		// 정수, 실수는 가능
		// 하지만 타입을 맞춘 후 비교
		
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; // true
		System.out.println(r9);
		
		
	}
}

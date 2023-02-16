package ch02.lecture.p05print;

public class C04Print {
	public static void main(String[] args) {
		// 아규먼트는 순서대로 적용됨
		System.out.printf("%d, %d%n", 3, 4);
		
		System.out.printf("%d, %f%n", 3, 3.14);
		
		System.out.printf("%f, %d, %s%n", 3.14, 999, "hello");
		
	}
}

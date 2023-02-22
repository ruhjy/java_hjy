package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {

		int a = 3;

		method1(a);
		System.out.println("a = " + a); // 3
	}

	// int b = a;
	public static void method1(int b) { // 기본형 매개변수
		System.out.println(b);
		b = 30;
		System.out.println(30);
	}
}

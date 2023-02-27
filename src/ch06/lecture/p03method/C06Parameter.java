package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		// 자동형변환
		int a = 3;
		long b = a;
		double c = b;
		char d = 'a';
		int e = d;

		MyClass06 o1 = new MyClass06();

		// 자동 형변환 가능한 타입은 매개값으로 전달 가능
		o1.method1(33); // int 타입 가능
		o1.method1('c'); // char 타입 가능
		System.out.println();

		o1.method2(321354684165165L); // long 타입 가능
		o1.method2(33); // int 타입 가능
		o1.method2('d'); // char 타입 가능
		System.out.println();

		o1.method3(3.14); // double 타입 가능
		o1.method3(321354684165165L); // long 타입 가능
		o1.method3(55); // int 타입 가능
		System.out.println();

		o1.method4(3.14f); // float 타입 가능
		o1.method4(2951651L); // long 타입 가능
		o1.method4(99); // int 타입 가능
//		o1.method4(3.14); // double 타입 불가능

	}
}

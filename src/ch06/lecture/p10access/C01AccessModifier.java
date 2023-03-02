package ch06.lecture.p10access;

public class C01AccessModifier {
	public static void main(String[] args) {

		MyClass01 o1 = new MyClass01();

		System.out.println(o1.name); // 접근 가능 - public
//		System.out.println(o1.age); // 접근 불가능 - private

		o1.method1(); // 실행(접근) 가능 - public
//		o1.method2(); // 실행(접근) 불가능 - private

	}
}

package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();

		int var1 = o1.method1();
		System.out.println(var1); // 3

		int var2 = o1.method1() * 2;
		System.out.println(var2); // 6

		System.out.println(o1.method1()); // 3
		System.out.println();

		String var3 = o1.method2();
		System.out.println(var3); // hello
		String var4 = o1.method2() + " java";
		System.out.println(var4); // hello java
		System.out.println(o1.method2()); // hello

		// 자동형변환
		long var5 = o1.method1(); // int 타입의 메서드
//		short var5 = o1.method1(); // 형변환 안됨
		System.out.println(var5);
	}
}

package ch06.lecture.p03method;

public class C09VarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();

		o1.method1();
		o1.method1(3);
		o1.method1(5, 7);
		System.out.println();

		o1.method2(new int[] {});
		o1.method2(new int[] { 3 });
		o1.method2(new int[] { 5, 7 });
		o1.method2(new int[] { 10, 20, 30 });

		o1.method3(45, 123, 5, 2);
		o1.method3(3, 6);
		o1.method3(34, 234, 6);
		o1.method3(new int[] { 6, 5, 4, 3, 2, 1 });
	}
}

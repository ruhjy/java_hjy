package ch12.lecture.p01object;

public class C03ToString {
	public static void main(String[] args) {

		MyClass03 o1 = new MyClass03();
		String s1 = o1.toString();
		System.out.println(s1);
		System.out.println(System.identityHashCode(o1));

		Object o2 = o1;
		System.out.println(o2.toString());
		System.out.println(System.identityHashCode(o2));
		System.out.println();

		Object o3 = new MyClass03();

		System.out.println(o3.toString());
		System.out.println(System.identityHashCode(o3));

	}
}

class MyClass03 {

}

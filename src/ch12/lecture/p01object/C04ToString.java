package ch12.lecture.p01object;

public class C04ToString {
	public static void main(String[] args) {

		Object o1 = "java";
		Object o2 = new String("java");

		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));

		System.out.println(o1.toString());
		System.out.println(o2.toString());

	}
}

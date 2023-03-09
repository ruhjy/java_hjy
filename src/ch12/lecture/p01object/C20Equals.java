package ch12.lecture.p01object;

public class C20Equals {
	public static void main(String[] args) {

		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		Object o4 = o1;

		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
		System.out.println();

		System.out.println(o1.equals(o4)); // true
		System.out.println(o1.equals(o3)); // true
		System.out.println(o1.equals(o2)); // false

	}
}

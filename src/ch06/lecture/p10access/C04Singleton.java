package ch06.lecture.p10access;

public class C04Singleton {
	public static void main(String[] args) {

		MyClass04 o1 = new MyClass04();
		MyClass04 o2 = new MyClass04();

		System.out.println(o1);
		System.out.println(o2);

		MyClass05 o3 = MyClass05.getInstance();
		MyClass05 o4 = MyClass05.getInstance();

		System.out.println(o3);
		System.out.println(o4);
	}
}

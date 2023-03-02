package ch06.lecture.p07constructor;

public class C04Constructor {
	public static void main(String[] args) {

		MyClass04 o1 = new MyClass04("abc", 300);
		MyClass04 o2 = new MyClass04("def", 500);

		o1.desc();
		o2.desc();
	}
}

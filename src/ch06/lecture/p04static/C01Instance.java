package ch06.lecture.p04static;

public class C01Instance {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();

		o1.age = 33;
		o1.name = "son";
		o1.greeting();

		MyClass01 o2 = new MyClass01();

		o2.age = 44;
		o2.name = "park";
		o2.greeting();
	}
}

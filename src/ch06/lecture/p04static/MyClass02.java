package ch06.lecture.p04static;

public class MyClass02 {

	// static field (class field(variable))
	static String name;
	static int age;

	// static method (class method)
	static void greeting() {
		System.out.println(age + "세 " + name + "입니다.");
	}
}

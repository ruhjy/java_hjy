package ch06.lecture.p04static;

public class MyClass05 {

	// instance field
	String name;

	// static field
	static String model;

	// instance method
	void printName() {
		System.out.println(name); 
		// instance method에서는 static member 접근 가능
		System.out.println(model);
		printModel();
	}

	// static method
	static void printModel() {
		System.out.println(model);
		// static method에서는 instance member 접근 불가능
//		System.out.println(name);
//		printName();
	}

}

package ch08.lecture.p03polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		o1.field = new MyClass01();
		o1.field = new MyClass02();

	}

}

class MyClass {
	MyInterface01 field;
}

interface MyInterface01 {

}

class MyClass01 implements MyInterface01 {

}

class MyClass02 implements MyInterface01 {

}
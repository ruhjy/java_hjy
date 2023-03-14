package ch16.lecture.p03reference;

import java.util.*;

public class C06ConstructorReference {
	public static void main(String[] args) {

		// 생성자 참조
		// Reference to a constructor
		MyInterface07 o1 = () -> {
			return new MyClass07();
		};
		MyInterface07 o2 = () -> new MyClass07();

		MyInterface07 o3 = MyClass07::new;

		MyInterface08 o4 = (a) -> new MyClass07(a);
		MyInterface08 o5 = MyClass07::new;

	}
}

interface MyInterface08 {
	MyClass07 action(int a);
}

interface MyInterface07 {
	MyClass07 action();
}

class MyClass07 {

	MyClass07() {

	}

	MyClass07(int a) {
	}
}
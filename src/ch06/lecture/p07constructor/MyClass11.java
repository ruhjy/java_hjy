package ch06.lecture.p07constructor;

public class MyClass11 {
	final String name = "son";
	final int age; // 생성자에서 값을 할당해야함

	MyClass11() {
		age = 99;
	}

	MyClass11(int age) {
		this.age = age;
	}
}

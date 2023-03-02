package ch06.lecture.p07constructor;

public class MyClass03 {
	String name;
	int age;

	MyClass03() {
		// 최초로 해야하는 일들..
		name = "son";
		age = 77;
	}

	void descript() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}

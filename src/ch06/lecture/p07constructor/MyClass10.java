package ch06.lecture.p07constructor;

public class MyClass10 {
	String name;
	int age;
	String birth;
	boolean married;

	MyClass10(String name) {
		this.name = name;
	}

	MyClass10(String name, int age) {
		this(name); // 다른 생성자 호출
//		this.name = name;
		this.age = age;
	}

	MyClass10(String name, int age, String birth) {
		this(name, age); // 다른 생성자 호출
//		this.name = name;
//		this.age = age;
		this.birth = birth;
	}

	void printField() {
		System.out.println("name:" + name + ", age:" + age + ", birth:" + birth);
	}
}

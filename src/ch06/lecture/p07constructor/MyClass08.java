package ch06.lecture.p07constructor;

public class MyClass08 {

	// 필드
	String name;
	int age;
	String birthDate;
	boolean married;

	// 생성자
	MyClass08(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}

	MyClass08(String name, int age, String birthDate, boolean married) {
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
		this.married = married;
	}

	// 책 224쪽에는 컴파일 에러라는데 이상 없음?
	MyClass08(String name, int age) {
		this.name = name;
		this.age = age;
	}

	MyClass08(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// 메서드
	public String toString() {
		return name + age + birthDate + married;
	}
}

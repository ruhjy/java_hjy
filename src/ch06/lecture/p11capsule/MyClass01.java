package ch06.lecture.p11capsule;

public class MyClass01 {
	private int age;

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void desc() {
		System.out.println("나이는 : " + this.age + "입니다.");
	}
}

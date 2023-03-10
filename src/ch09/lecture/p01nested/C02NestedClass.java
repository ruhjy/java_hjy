package ch09.lecture.p01nested;

public class C02NestedClass {
	public static void main(String[] args) {

	}
}

class MyClass02 {

	class Nested02 {

	}

	// 필드에 사용(호출) 가능
	Nested02 item = new Nested02();

	// 메서드 내부에 사용(호출) 가능
	void mehtod1() {
		Nested02 local = new Nested02();
	}

}

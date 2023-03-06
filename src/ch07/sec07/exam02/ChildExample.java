package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {

		// 자식 객체 생성
		Child child = new Child();

		// 자동 타입 변환
		Parent parent = child;

		// 메서드 호출
		parent.method1(); // Parent-method1()
		parent.method2(); // Child-method2()
//		parent.method3(); // Parent 타입 참조변수 parent에는 method3()을 가지고 있지 않다. (기능이 없다?)

	}
}

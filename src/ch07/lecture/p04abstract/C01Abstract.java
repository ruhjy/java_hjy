package ch07.lecture.p04abstract;

public class C01Abstract {
	public static void main(String[] args) {

		Animal a1 = new Horse();
		Animal a2 = new Fish();

		// Animal 클래스에 abstract 키워드를 붙여서 추상클래스가 되었다.
		// 추상클래스는 인스턴스 생성 불가 - 컴파일 오류
//		Animal a3 = new Animal(); // 추상적인 클래스로 남기고 싶다.
	}
}

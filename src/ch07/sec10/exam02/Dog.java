package ch07.sec10.exam02;

public class Dog extends Animal {

	// 추상 메서드 재정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}

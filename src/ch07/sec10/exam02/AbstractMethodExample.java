package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		System.out.println();

		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		System.out.println();

		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	// 자동 타입 변환
	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메서드 호출
	}
}

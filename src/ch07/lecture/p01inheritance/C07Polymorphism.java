package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {

		Animal o1 = new Animal();
		Horse o2 = new Horse();
		Fish o3 = new Fish();

		o1.breath();
		o2.breath();
		o3.breath();
		System.out.println();

		// 실제 인스턴스에 있는 기능으로 동작
		Animal o4 = new Horse();
		Animal o5 = new Fish();

		o4.breath();
		o5.breath();

		Fish f1 = (Fish) o5;
		f1.breath();
	}
}

class Animal {

	public void breath() {
		System.out.println("호흡한다.");
	}
}

class Horse extends Animal {

	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}

class Fish extends Animal {

	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
}
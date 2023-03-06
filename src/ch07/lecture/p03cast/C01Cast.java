package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {

		Animal a1 = new Horse();
		a1.breath();
//		a1.run(); // xxx

		Horse h1 = (Horse) a1; // 강제 형변환(type cast) 필요
		h1.run(); // ooo

		System.out.println();

		Animal a2 = new Fish();
		a2.breath();
//		a2.swim(); // xxx

		Fish f1 = (Fish) a2; // 강제 형변환(type casting) 필요
		f1.swim(); // ooo

	}
}

class Animal {

	public void breath() {
		System.out.println("호흡한다.");
	}
}

class Fish extends Animal {

	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}

	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal {

	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}

	public void run() {
		System.out.println("달립니다.");
	}
}
package ch07.lecture.p03cast;

public class C09Instanceof {
	public static void main(String[] args) {

		action(new Animal());
		System.out.println();

		action(new Horse());
		System.out.println();

		action(new Fish());

	}

	public static void action(Animal a) {

		a.breath();

		if (a instanceof Horse h) {
			h.run();
		} else if (a instanceof Fish f) {
			f.swim();
		} else {
			System.out.println("말도 물고기도 아닙니다.");
		}
	}
}

package ch07.lecture.p02polymorphism;

public class C08Polymorphism {
	public static void main(String[] args) {

		Gun o1 = getGun();

		Weapon o2 = getGun();
		Weapon o3 = getBow();
		Weapon o4 = getSword();

		o1.attack(); // 총으로 공격합니다.
		o2.attack(); // 총으로 공격합니다.
		o3.attack(); // 활을 쏩니다.
		o4.attack(); // 검을 휘두릅니다.
	}

	public static Gun getGun() {
		return new Gun();
	}

	public static Bow getBow() {
		return new Bow();
	}

	public static Sword getSword() {
		return new Sword();
	}

}

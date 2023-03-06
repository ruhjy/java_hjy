package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	public static void main(String[] args) {

		Hero hero = new Hero();

		// ... 무기선택
		Weapon w = getWeapon(1); // new Gun();

		hero.weapon = w;
		hero.button1(); // weapon.attack(); weapon = new Gun(); class Gun의 오버라이딩된 attack 메서드 실행
	}

	public static Weapon getWeapon(int choice) {
		switch (choice) {
			case 1 -> {
				return new Gun();
			}
			case 2 -> {
				return new Bow();
			}
			case 3 -> {
				return new Sword();
			}
			default -> {
				return new Weapon();
			}
		}
	}
}

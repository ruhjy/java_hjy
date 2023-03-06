package ch07.lecture.p02polymorphism;

// 배열로 객체 다루기
public class C09Polymorphism {
	public static void main(String[] args) {

		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();

		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();

		Weapon[] o5 = new Weapon[5];
		o5[0] = new Weapon();
		o5[1] = new Gun();
		o5[2] = new Bow();
		o5[3] = new Sword();

		o5[0].attack(); // Weapon의 attack() 메서드 실행
		o5[1].attack(); // Gun의 attack() 메서드 실행
		o5[2].attack(); // Bow의 attack() 메서드 실행
		o5[3].attack(); // Sword의 attack() 메서드 실행
	}

}

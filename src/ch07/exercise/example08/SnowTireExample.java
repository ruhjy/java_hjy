package ch07.exercise.example08;

public class SnowTireExample {
	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = new Tire();

		snowTire.run(); // 스노우 타이어가 굴러갑니다.
		tire.run(); // 일반 타이어가 굴러갑니다.
	}
}
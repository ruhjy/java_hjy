package ch08.exercise.example05;

public class Tv implements Remocon {

	// 추상 메서드 재정의
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}

	public static void main(String[] args) {

		Remocon r = new Tv();
		r.powerOn();
	}

}

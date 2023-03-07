package ch08.exercise.example06;

public class Dog implements Soundable {

	// 추상 메서드 재정의
	@Override
	public String sound() {
		return "멍멍";
	}

}

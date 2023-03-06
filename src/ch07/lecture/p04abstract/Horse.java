package ch07.lecture.p04abstract;

public class Horse extends Animal {

	// 추상 메서드는 꼭 재정의 되어야 함
	@Override
	public void breathe() {
		System.out.println("폐로 숨쉼");
	}

}

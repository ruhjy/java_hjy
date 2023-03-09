package ch12.lecture.p02wrapper;

public class C05UnBoxing {
	public static void main(String[] args) {

		Integer i1 = 30; // auto boxing

		int i2 = 50; // 기본타입

		int i3 = i1 * i2; // 지금 버전
		int i4 = i1.intValue() * i2; // 예전 버전

		int i5 = i1.intValue(); // unboxing
		int i6 = i1; // auto unboxing - 현재
	}
}

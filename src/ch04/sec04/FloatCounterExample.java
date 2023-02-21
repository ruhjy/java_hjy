package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {

		// 이론적으로는 10번 반복, 실제 9번 반복
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}

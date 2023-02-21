package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 2로 나눈 값이 0이 아닐 경우
				continue;
			}
			System.out.print(i + " ");
		}
	}
}

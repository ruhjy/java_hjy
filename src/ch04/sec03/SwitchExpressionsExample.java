package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch (grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		// 명령문이 하나만 있을 경우 중괄호 생략 가능
		switch (grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님입니다.");
		}
	}
}

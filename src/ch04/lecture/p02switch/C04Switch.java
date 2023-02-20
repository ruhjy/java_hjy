package ch04.lecture.p02switch;

public class C04Switch {
	public static void main(String[] args) {
		
		int val = 3;

		switch (val) {
			case 1:
				System.out.println("code 1");
				break;
			case 2:
				System.out.println("code 2");
				break;
			case 3:
			case 4:
				System.out.println("code 3, 4");
				break;
			default:
				System.out.println("default code");
				break;
		}
		
		// switch labeled statement
		// break문 없이 코드 블럭 작성 가능
		// : 을 빼고   -> 사용
		// 명령문 하나일 때 중괄호 생략 가능
		switch (val) {
			case 1 -> System.out.println("code 1"); 
			
			case 2 -> {
				System.out.println("code 2");
			}
			case 3, 4 -> System.out.println("code 3, 4");
			
			default -> {
				System.out.println("default code");
			}
		}
	}
}

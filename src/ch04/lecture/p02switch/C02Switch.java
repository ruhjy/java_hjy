package ch04.lecture.p02switch;

public class C02Switch {
	public static void main(String[] args) {
		// break
		// switch 내 실행 흐름 종료
		
		int val = 2;

		switch (val) {
			case 1:
				System.out.println("code 1");
			case 2:
				System.out.println("code 2");
			case 3:
				System.out.println("code 3");
			defalut:
				break;
		}
	}
}

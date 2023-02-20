package ch04.lecture.p03while;

public class C01While {
	public static void main(String[] args) {
		// while
		// 반복문(loop)

		// 조건이 true이면 코드블럭 실행
		// 코드 블럭 실행 후 조건 확인
		// 반복

		System.out.println("이전 실행문..");
		
		boolean con = false;
		while (con) {
			System.out.println("반복해야할 명령문1");
			System.out.println("반복해야할 명령문2");
		}
		
		System.out.println("다음 실행문...");
	}
}

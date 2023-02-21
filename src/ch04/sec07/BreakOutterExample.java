package ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
					for (char lower = 'a'; lower <= 'z'; lower++) {
						System.out.println(upper + "-" + lower);
		
						if (lower == 'g') {
//							break Outter;
							break;
						}
					}
					System.out.println();
				}

		System.out.println("프로그램 실행 종료");
	}
}

/* 
 * break Outter; 사용시 A-g에서 전체 반복문 종료
 * break; 사용시 A-g에서 안쪽 반복문 벗어나고 B-g, C-g에서 벗어남
 * 				 Z-g까지 출력하고 프로그램 종료
 */

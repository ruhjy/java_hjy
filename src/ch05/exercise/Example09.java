package ch05.exercise;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		// 9. 학생들의 점수를 분석하는 프로그램을 만들려고 합니다.
		// 키보드로부터 학생 수와 각 학생들의 점수를 입력받고
		// while 문과 Scanner의 nextLine() 메서드를 이용해서
		// 최고 점수 및 평균 점수를 출력하는 코드를 작성

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int student = 0;
		int[] scores = new int[0];

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			int input = scan.nextInt();

			if (input == 1) {
				System.out.print("학생수> ");
				student = scan.nextInt();
				scores = new int[student];
			} else if (input == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("score[%d]> ", i);
					scores[i] = scan.nextInt();
				}

			} else if (input == 3) {
				for (int i = 0; i < student; i++) {
					System.out.printf("score[%d]: %d%n", i, scores[i]);
				}

			} else if (input == 4) {
				int max = scores[0];
				double sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum / student);
			} else if (input == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
}

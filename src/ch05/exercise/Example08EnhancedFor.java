package ch05.exercise;

public class Example08EnhancedFor {
	public static void main(String[] args) {

		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		// 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드 작성
		// 향상된 for문 사용
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		for (int[] a : array) {
			for (int b : a) {
				sum += b;
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}
}

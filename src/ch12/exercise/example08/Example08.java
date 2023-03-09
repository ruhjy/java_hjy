package ch12.exercise.example08;

public class Example08 {
	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		long end = System.nanoTime();

		double avg = (double) sum / scores.length;
		System.out.println(avg);
		System.out.println("걸린 시간: " + (end - start) + "ns");
	}
}

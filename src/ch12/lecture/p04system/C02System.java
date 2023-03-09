package ch12.lecture.p04system;

public class C02System {
	public static void main(String[] args) {

		long start = System.nanoTime();

		for (long i = 0; i < 1000_0000_0000L; i++) {
			int r = 3 * 5;
		}

		long end = System.nanoTime();

		System.out.println(end - start + "ns");
	}
}

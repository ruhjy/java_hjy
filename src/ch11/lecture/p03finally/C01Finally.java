package ch11.lecture.p03finally;

public class C01Finally {
	public static void main(String[] args) {

		try {
//			int a = 0;
			int a = 1;
			int c = 3 / a;

			System.out.println("try block continue.....");

		} catch (ArithmeticException e) {
			System.out.println("exception!!!!!");
		} finally {
			// exception 발생 유무와 상관없이 항상 실행
			System.out.println("finally block @@@@@@");
		}

		System.out.println("continue....");
	}
}

package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {

		try {
			int[] a = { 0, 1 };

			// ArithmeticException
			// ArrayIndexOutOfBoundsException
			int c = 3 / a[2];

		// exception 상위 타입으로 명시해서 catch 블럭 한개로 예외 처리 가능
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		System.out.println("continue");
	}
}

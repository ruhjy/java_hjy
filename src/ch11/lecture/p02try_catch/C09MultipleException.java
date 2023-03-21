package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {

		try {

			// 여러 exception 발생 가능
			// 여러 exception 발생 가능

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}

package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {

		try {

			// 여러 exception 발생 가능

		} catch (RuntimeException e) {
			// 아래 catch 블럭의 exception 보다
			// 상위 타입의 exception catch 블럭을 먼저 작성할 수 없다.
			e.printStackTrace();
		} catch (ArithmeticException e) { // RuntimeException의 하위타입들은 컴파일 에러 발생
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("continue....");
	}
}

package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {

	}

	// checked exception은 throws나 try/catch 필수
	public static void method2() throws Exception {
		throw new ClassNotFoundException();
	}

	public static void method1() throws RuntimeException {
		throw new ClassCastException();
	}
}

package ch11.exercise.example05;

public class Example {

	public static void m1() {
		try {
			method1();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public static void m2() throws Exception {
		method1();
	}

	public static void m3() {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void m4() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws NumberFormatException, ClassNotFoundException {

	}
}

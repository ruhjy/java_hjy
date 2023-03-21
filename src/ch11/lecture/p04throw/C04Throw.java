package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {

		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}

	public static void method1() {
		// RuntimeException 객체 던지기 - unchecked exception
		throw new RuntimeException();
	}
}

package ch11.lecture.p01exception;

public class C02RuntimeException {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 3;
		
		int c = b / a; // ArithmeticException
		
		System.out.println("실행 흐름 이어감.");
		
	}
}

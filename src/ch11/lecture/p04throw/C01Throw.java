package ch11.lecture.p04throw;

public class C01Throw {
											// 던지는 객체 타입 명시
	public static void main(String[] args) throws Throwable {
		
		// Throwable 타입의 객체를 던질 수 있음
		Throwable a = new Exception();
		
		// 객체 던지기
		throw a;
	}
}

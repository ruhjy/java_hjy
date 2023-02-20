package ch04.lecture.p02switch;

public class C03Switch {
	public static void main(String[] args) {
		// switch에서 사용 가능한 값 type
		// byte, short, int, char, String, enum, Character, Byte, Short, Integer
		// long 타입은 컴파일 에러
		// Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		
		long val = 1L;
		
		switch (val) {
			case 1:
				
				break;
			default:
				
		}
	}
}

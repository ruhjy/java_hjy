package ch02.lecture.p02type;

public class C05Long {
	public static void main(String[] args) {
		// long (8 bytes, 64bits)
		// ( ??억 ~ ??억 ) ( -2^63 ~ 2^63-1 )

		long l1 = 2147483647; // int의 범위는 가능 접미사 안붙이면 int로 인식
		l1 = 2147483648L; // long 타입 수는 끝에 (l, L) 붙임

		l1 = 999_827_341_974_192L; // _ 를 구분자로 사용해서 자릿수 표현가능
		l1 = -999_929_837_972_592L;

	}
}

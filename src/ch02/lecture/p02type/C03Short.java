package ch02.lecture.p02type;

public class C03Short {
	public static void main(String[] args) {
		// short (2 bytes, 16bits)
		// ( -32,768 ~ 32,767 ) ( -2^15 ~ 2^15-1 )

		short s1;
		s1 = 0;
		s1 = 32767;
		s1 = -32767;

//		저장가능한 허용 범위에 벗어나서 에러.
//		s1 = 32768;
//		s1 = -32769;
	}
}

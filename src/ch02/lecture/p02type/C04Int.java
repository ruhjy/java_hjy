package ch02.lecture.p02type;

public class C04Int {
	public static void main(String[] args) {
		// int (4 bytes, 32bits)
		// ( -21억 ~ 21억 ) ( -2^31 ~ 2^31-1 )

		int i1 = -2147483648;
		i1 = 2147483647;

//		저장가능한 허용 범위에 벗어나서 에러.
//		i1 = 2147483648;
//		i1 = -2147483649;

	}

}

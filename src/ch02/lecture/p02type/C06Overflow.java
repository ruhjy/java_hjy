package ch02.lecture.p02type;

public class C06Overflow {
	public static void main(String[] args) {
		int i1 = 2147483647;
		int i2 = i1 + 1; // -2147483648
		// int의 범위를 벗어나면 최소범위로 감 = overflow

		System.out.println(i1);
		System.out.println(i2);

	}
}

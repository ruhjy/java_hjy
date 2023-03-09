package ch12.lecture.p02wrapper;

public class C04Boxing {
	public static void main(String[] args) {

		int i1 = 30000;
		int i2 = 30000;

		System.out.println(i1 == i2); // true

		Integer o1 = i1;
		Integer o2 = i2;

		System.out.println(o1 == o2); // false (참조값 비교 - 사용하지마세요)
		System.out.println(o1.equals(o2)); // true (내부값 비교)
	}
}

package ch14.lecture.p04name;

public class C01Name {
	public static void main(String[] args) {
		// 현재 쓰레드 객체 얻기
		Thread t1 = Thread.currentThread();

		// 쓰레드 이름 얻기
		System.out.println(t1.getName());

		// 쓰레드 이름 바꾸기
		t1.setName("메인 쓰레드");
		System.out.println(t1.getName());
	}
}

package ch14.lecture.p01thread;

public class C01Thread {
	public static void main(String[] args) {

		// Thread 만들기
		Thread t1 = new Thread();
		// Thread 시작
		t1.start();

		// Thread 만들기
		Thread t2 = new Thread();
		// Thread 시작
		t2.start();
	}
}

package ch14.lecture.p01thread;

public class C03Thread {
	public static void main(String[] args) {

		Process03 o1 = new Process03();
		Thread t1 = new Thread(o1);

		t1.start();

		while (true) {
			System.out.println("@@@ 메인 실행중 @@@");
		}
	}
}

class Process03 implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("### 쓰레드 실행중 ###");
		}
	}
}

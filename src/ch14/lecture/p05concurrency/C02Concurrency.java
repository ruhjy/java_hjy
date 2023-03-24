package ch14.lecture.p05concurrency;

public class C02Concurrency {
	// synchronized 블럭 (동기화 블럭)

	static int field = 0;

	public static void main(String[] args) {
		
		// intrinsic lock, monitor lock, monitor, lock
		Object o = new Object();
//		Object o1 = new Object();

		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (o) { // 획득 실행 반납
					field++;
				}
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (o) {
					field++;
				}
			}
		});

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(field);
	}
}

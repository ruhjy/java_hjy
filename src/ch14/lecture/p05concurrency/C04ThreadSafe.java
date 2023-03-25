package ch14.lecture.p05concurrency;

import java.util.concurrent.atomic.*;

public class C04ThreadSafe {

	static int field = 0;
	// 상황에 따라 동시성 문제를 해결할 수 있는 방법 중 AtomicInteger(AtomicType)
	static AtomicInteger atomicField = new AtomicInteger(0);

	public static void main(String[] args) {
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicField.getAndIncrement();
			}
		});
		
		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicField.getAndIncrement();
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
		System.out.println(atomicField);
	}
}

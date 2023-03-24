package ch14.lecture.p05concurrency;

public class C03SynchronizedMethod {

	public static void main(String[] args) {
		Box box = new Box();

		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				box.increase();
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				box.increase();
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

		System.out.println(box.item);

	}
}

class Box {
	public int item = 0;

	public synchronized void increase() {
		item++;
	}
}

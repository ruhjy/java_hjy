package ch14.lecture.p05concurrency;

import java.util.*;

public class C06Vector {

	static List<Integer> list = new Vector<>();

	public static void main(String[] args) {

		Thread a = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				list.add(9);
				list.remove(0);
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				list.add(9);
				list.remove(0);
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
		
		System.out.println(list);
	}
}

package ch14.sec06.exam01;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) { // 동기화 메서드
		this.memory = memory; // 메모리값 저장
		try {
			Thread.sleep(2000); // 2초간 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}

	public void setMemory2(int memory) {
		synchronized (this) { // 동기화 블럭
			this.memory = memory; // 메모리 값 저장
			try {
				Thread.sleep(2000); // 2초간 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}

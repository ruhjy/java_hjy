package ch06.lecture.exercise.exam19;

public class Account {

	private int balance;

	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1_000_000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
//		} else if (MIN_BALANCE > balance && balance > MAX_BALANCE) {
//			balance = this.balance; // 이 코드가 의미가 없는건가 없네
//		}
	}

}

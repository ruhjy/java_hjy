package ch15.exercise.example0620;

public class Account {

	private String accountNumber;
	private String accountHolder;
	private int initAmount;

	public Account(String accountNumber, String accountHolder, int initAmount) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.initAmount = initAmount;
	}

	public int moneyIn(int money) {
		return initAmount += money;
	}

	public int moneyOut(int money) {
		return initAmount -= money;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getInitAmount() {
		return initAmount;
	}

	public void setInitAmount(int initAmount) {
		this.initAmount = initAmount;
	}

	public String toString() {
		return "계좌번호 = " + accountNumber + ", 계좌주 = " + accountHolder + ", 초기입금액 = " + initAmount;
	}

}

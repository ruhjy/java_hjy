package ch15.exercise.example0520;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {

//		Account account;
//		Account[] accountArr = new Account[100]; // accounts
		List<Account> accountList = new ArrayList<>();
		int idx = 0;

		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("-------------------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();

			switch (input) {

			case 1 -> {
				System.out.println("----------");
				System.out.println("계좌생성");
				System.out.println("----------");

				System.out.print("계좌번호: ");
				String accountNumber = scanner.next();

				System.out.print("계좌주: ");
				String accountHolder = scanner.next();

				System.out.print("초기입금액: ");
//				String str3 = scanner.next();
//				int initAmount = Integer.valueOf(str3);
				int initAmount = scanner.nextInt();

//				account = new Account(accountNumber, accountHolder, initAmount);
//				accountArr[idx++] = account;
				accountList.add(new Account(accountNumber, accountHolder, initAmount));
//				if (account != null) {
				if (accountList != null) {
					System.out.println("결과: 계좌가 생성되었습니다.");
				}
			}
			case 2 -> {
				System.out.println("----------");
				System.out.println("계좌목록");
				System.out.println("----------");
//				for (int i = 0; i < accountList.size(); i++) { // accountArr.length -> idx;
//					System.out.println(accountList.get(i));
//				}
				for (Account account : accountList) {
					System.out.println(account);
				}
			}
			case 3 -> {
				System.out.println("----------");
				System.out.println("예금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountNumber = scanner.next();
				System.out.print("예금액: ");
				int money = scanner.nextInt();
//				accountList.forEach(account -> 
//				for (int i = 0; i < accountList.size(); i++) {
//					if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
//						accountList.get(i).moneyIn(money);
//						System.out.println("결과: 예금이 성공되었습니다.");
//					}
//				}
				for (Account account : accountList) {
					if (account.getAccountNumber().equals(accountNumber)) {
						account.moneyIn(money);
						System.out.println("결과: 예금이 성공되었습니다.");
					}
				}
			}
			case 4 -> {
				System.out.println("----------");
				System.out.println("출금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountNumber = scanner.next();
				System.out.print("출금액: ");
				int money = scanner.nextInt();
//				for (int i = 0; i < accountList.size(); i++) {
//					if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
//						accountList.get(i).moneyOut(money);
//						System.out.println("결과: 출금이 성공되었습니다.");
//					}
//				}
				for (Account account : accountList) {
					if (account.getAccountNumber().equals(accountNumber)) {
						account.moneyOut(money);
						System.out.println("결과: 출금이 성공되었습니다.");
					}
				}
			}
			case 5 -> {
				run = false;
				System.out.println("프로그램 종료");
			}
			} // switch문 종료
		} // while문 종료
	} // main 종료
}

package ch11.exercise.example07;

public class LoginExample {
	public static void main(String[] args) {

		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if (!id.equals("blue")) {
			String message = "아이디가 존재하지 않습니다.";
//			String message = id + "가 없습니다.";
			throw new NotExistIDException(message);
		}

		// password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if (!password.equals("12345")) {
			String message = "패스워드가 틀립니다.";
//			String message = password + "가 존재하지 않습니다.";
			throw new WrongPasswordException(message);
		}
	}
}

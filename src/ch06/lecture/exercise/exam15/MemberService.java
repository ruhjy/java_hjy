package ch06.lecture.exercise.exam15;

public class MemberService {

	boolean login(String id, String pwd) {
		if (id.equals("hong") && pwd.equals("12345")) {
			return true;
		}
		return false;
		
//		return id.equals("hong") && pwd.equals("12345");
	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

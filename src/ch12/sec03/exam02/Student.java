package ch12.sec03.exam02;

public class Student {

	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	// 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴
	// (번호와 이름이 같으면 동일한 해시코드가 생성됨)
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	// Student 객체인지 확인하고, 학생 번호와 이름이 같으면 true
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}

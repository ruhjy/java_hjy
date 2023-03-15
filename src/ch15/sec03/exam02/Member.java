package ch15.sec03.exam02;

public class Member {

	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	// hashCode 재정의
	// name과 age 값이 같으면 동일한 hashCode가 리턴됨
	@Override
	public int hashCode() {
//		return Objects.hash(name, age);
		return name.hashCode() + age;
	}

	// equals 재정의
	// name과 age 값이 같으면 true가 리턴됨
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member target = (Member) obj;
			return target.name.equals(this.name) && (target.age == this.age);
//			return this.name.equals(target.name) && (this.age == target.age);
		} else {
			return false;
		}
	}
}

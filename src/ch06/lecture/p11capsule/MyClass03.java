package ch06.lecture.p11capsule;

public class MyClass03 {

	private String name;
	private int age;
	private String address;
	private boolean married;

	public void setMarried(boolean married) {
		this.married = married;
	}

	// boolean 타입의 getter는 is로 시작
	public boolean isMarried() {
		return this.married;
	}

	// 메서드 통해서 필드에 접근하도록
	public void setName(String name) {
		// 변경
		this.name = name;
	}

	public String getName() {
		// 읽기
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

}

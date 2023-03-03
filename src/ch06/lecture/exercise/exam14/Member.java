package ch06.lecture.exercise.exam14;

public class Member {

	private String name;
	private String id;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "name = " + name + " id = " + id;
	}
}

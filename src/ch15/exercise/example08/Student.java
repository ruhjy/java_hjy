package ch15.exercise.example08;

import java.util.*;

public class Student {

	private int studentNum;
	private String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(studentNum, name);
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;

		Student other = (Student) obj;
//		return other.name.equals(other.name) && (other.studentNum == studentNum);
		return other.studentNum == studentNum;
	}

}

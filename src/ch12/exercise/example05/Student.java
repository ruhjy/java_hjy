package ch12.exercise.example05;

import java.util.*;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj != null & obj instanceof Student))
			return false;

		Student student = (Student) obj;

		return studentNum.equals(student.getStudentNum());
		

	}
}

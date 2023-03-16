package ch15.exercise.example10;

public class Student implements Comparable<Student> {

	private String id;
	private int score;

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return (score > o.score) ? 1 : (score == o.score) ? 0 : -1;
//		if (score > o.score)
//			return 1;
//		else if (score == o.score)
//			return 0;
//		else
//			return -1;
	}

}

package ch16.exercise.example08;

public class Example {

	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	// avg() 메서드 작성
//	private static double avg(Function<Student> fun) {
//		int mathScores = 0;
//		for (Student f : student) {
//			mathScores += f.getMathScore();
//		}
//		fun.apply();
//		return (double) mathScores / student.length;
//	}

	private static double avg(Function<? super Student> function) {
		double sum = 0;
		for (Student s : students) {
//			double score = function.apply(s);
//			sum += score;
			sum += function.apply(s);
		}
		return sum / students.length;
	}

//	private static double avg(Function<Student> function) {
//		double scores = 0;
//		for (int i = 0; i < students.length; i++) {
//			scores += function.apply(students[i]);
//		}
//		return scores / students.length;
//	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}

package ch16.exercise.example09;

import ch16.exercise.example08.*;

public class Example {
	public static void main(String[] args) {

		double englishAvg = avg(s -> s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);

		double mathAvg = avg(s -> s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
	}
}

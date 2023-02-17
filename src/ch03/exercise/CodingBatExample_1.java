package ch03.exercise;

public class CodingBatExample_1 {
	public static void main(String[] args) {
		int a = 9, b = 10;
		int sum = a + b;

//		if ((a == 10 || b == 10) && (sum == 10)) { // x
		if ((a == 10 || b == 10) || (sum == 10)) { // o
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
}

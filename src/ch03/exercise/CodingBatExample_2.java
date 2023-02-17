package ch03.exercise;

public class CodingBatExample_2 {
	public static void main(String[] args) {
		int n = 89;

		if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

//public boolean nearHundred(int n) {
//	  return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
//	}
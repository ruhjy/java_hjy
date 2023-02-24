package ch05.exercise;

import java.util.Arrays;

public class Example07Sort {
	public static void main(String[] args) {

		int[] array = { 1, 5, 3, 8, 2 };

		Arrays.sort(array);

		System.out.println(array[array.length - 1]);
	}
}

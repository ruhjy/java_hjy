package ch02.lecture.p05print;

import java.util.Scanner;

public class C06Print {
	public static void main(String[] args) {
		// 백준 3003번
//		String input = "0 1 2 2 2 7";
		String input = "2 1 2 1 2 1";	
		
		Scanner s = new Scanner(input);
		int king = s.nextInt();
		int queen = s.nextInt();
		int rook = s.nextInt();
		int bishop = s.nextInt();
		int knight = s.nextInt();
		int pawn = s.nextInt();
		
		System.out.printf("%d %d %d %d %d %d",
				(1 - king),
				(1 - queen),
				(2 - rook),
				(2 - bishop),
				(2 - knight),
				(8 - pawn));
	}
}

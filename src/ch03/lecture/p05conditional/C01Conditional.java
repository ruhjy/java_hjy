package ch03.lecture.p05conditional;

public class C01Conditional {
	public static void main(String[] args) {
		// 삼항(ternary), 조건(conditional), ?
		// 1항 ? 2항 : 3항
		// 연산결과 : 1항이  true면 2항
		//			  1항이 false면 3항
		
		int x = 5;
		int y = 10;
		
		int r1 = true ? x : y;
		System.out.println(r1); // 5
		
		int r2 = false ? x : y;
		System.out.println(r2); // 10
	}
}

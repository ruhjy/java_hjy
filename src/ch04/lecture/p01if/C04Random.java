package ch04.lecture.p01if;

public class C04Random {
	public static void main(String[] args) {
		// Math.random()
		// 0 <= Math.random() < 1 의 double 값 리턴

		// ex1) 0, 1, 2
		int res1 = (int) (Math.random() * 3);
		System.out.println(res1);

		// ex2) 1, 2, 3
		int res2 = (int) (Math.random() * 3) + 1;
		System.out.println(res2);

		// ex3) 주사위 (1, 2, 3, 4, 5, 6)
		int res3 = (int) (Math.random() * 6) + 1;
		System.out.println(res3);

		// ex4) 로또번호 (1 ~ 45)
		int lottoNumber = (int) (Math.random() * 45) + 1;
		System.out.println(lottoNumber);
	}
}

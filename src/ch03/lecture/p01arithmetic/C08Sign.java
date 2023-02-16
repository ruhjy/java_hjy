package ch03.lecture.p01arithmetic;

public class C08Sign {
	public static void main(String[] args) {
		// 부호 연산자
		// +, -

		int a = 3;
		int b = +5;

		int c = 7;
		int d = -9;

		int e = +b;
		int f = -d;
		System.out.println(f); // 9

		String g = "33";
//		int h = +g; // 컴파일 오류

		int value = 356;
		int rrr = value / 100 * 100;
		System.out.println(rrr);

		int xx = 10;
		int yy = 5;

		System.out.println((xx > 7));
		System.out.println((yy <= 5));
		System.out.println((xx > 7) && (yy <= 5));
		System.out.println((xx % 3 == 2));
		System.out.println((yy % 2 != 1));
		System.out.println((xx % 3 == 2) || (yy % 2 != 1));
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop+lengthBottom)*height/2.0;
		double area2 = (lengthTop+lengthBottom)*height*1.0/2;
		double area3 = (double)(lengthTop+lengthBottom)*height/2;
		double area4 = (double)((lengthTop+lengthBottom)*height/2);
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
	}
}

package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대 (Infinity)
		double a = 0.0;
		double b = 3.0;

		double c = b / a;

		System.out.println(c); // Infinity
		
		double d = -3.0;
		
		double e = d / a;
		System.out.println(e); // -Infinity
		
		// 실수를 0으로 나눈 나머지 : NaN (Not a Number)
		double f = 3.0 % 0.0; // NaN (Not a Number)
		System.out.println(f);
		
		double g = f + 1.0; 
		System.out.println(g); // NaN에 어떤 연산을 하더라도 NaN
		
		// 무한대인지 확인
		boolean isinfinite1 = Double.isInfinite(c);
		System.out.println(isinfinite1); // true
		
		boolean isinfinite2 = Double.isInfinite(3.0);
		System.out.println(isinfinite2); // false
		
		// NaN인지 확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1); // true
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2); // false
	}
}

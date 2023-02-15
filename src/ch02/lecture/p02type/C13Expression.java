package ch02.lecture.p02type;

import javax.print.attribute.standard.MultipleDocumentHandling;

import ch02.sec04.FloatDoubleExample;

public class C13Expression {
	public static void main(String[] args) {
		// 연산 중 자동 형변환
		
		byte b1 = 30;
		byte b2 = 10;
		
		// byte, short, char, int 의 연산 결과는 int
//		byte b3 = b1 + b2;
		int i3 = b1 + b2;
		System.out.println("i3 = " + i3);
		
		byte b4 = (byte) (b1 + b2);
		System.out.println("b4 = " + b4);
		byte b5 = 30 + 10;
		System.out.println("b5 = " + b5);
		
		// 정수간의 연산에서 long이 포함된 연산의 결과는 long
		long l6 = 30;
		long l7 = 10;
//		int i6 = l6 + l7;
		long l8 = l6 + l7;
		System.out.println("l8 = " + l8);
		
		int i9 = 20;
		long l10 = i9 + l7;
		System.out.println("l10 = " + l10);
		
		int i10 = (int) (i9 + l7);
		System.out.println("i10 = " + i10);
		
		// 정수와 실수끼리 연산 결과는 실수
		int i11 = 30;
		double d11 = 3.14;
		double d12 = i11 + d11;
		System.out.println("d12 = " + d12);
	}
}

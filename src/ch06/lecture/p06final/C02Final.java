package ch06.lecture.p06final;

public class C02Final {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		o1.i = 99;
		o1.i = 100;
		o1.i = 200;

//		o1.j = 3333; // (x) final 변수라서 수정 불가
	}
}

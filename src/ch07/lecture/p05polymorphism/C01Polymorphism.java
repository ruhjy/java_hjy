package ch07.lecture.p05polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {

		Integer i1 = new Integer(33);
		Integer i2 = new Integer("33");

		Number n1 = i1;
		Number n2 = i2;

		Object o1 = i1;
		Object o2 = i2;

//		Number n3 = new Number(); // Number는 추상 클래스

	}
}

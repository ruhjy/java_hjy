package ch08.lecture.p05cast;

public class C03Instanceof {
	public static void main(String[] args) {

		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();

		boolean b1 = o1 instanceof MyClass021;
		System.out.println("b1 : " + b1); // true
		boolean b2 = o1 instanceof MyInterface02;
		System.out.println("b2 : " + b2); // true
		
		System.out.println(o2 instanceof MyClass022); // true
		System.out.println(o2 instanceof MyInterface02); // true
		System.out.println();
		
		System.out.println(o1 instanceof MyClass022); // false
		System.out.println(o2 instanceof MyClass021); // false
	}
}

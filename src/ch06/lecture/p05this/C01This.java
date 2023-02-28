package ch06.lecture.p05this;

public class C01This {

	public static void main(String[] args) {

		MyClass01 o1 = new MyClass01();

		o1.name = "son";
		o1.printName();
		System.out.println();
		
		String s = o1.now();
		System.out.println(s);
	}
}

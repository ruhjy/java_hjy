package ch06.lecture.p11capsule;

public class C01Encapulation {
	public static void main(String[] args) {

		MyClass01 o1 = new MyClass01();

		o1.setAge(3);
		o1.desc();
		o1.setAge(-1);
		o1.desc();
	}
}

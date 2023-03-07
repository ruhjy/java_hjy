package ch08.lecture.p03polymorphism;

public class C05Polymorphism {
	public static void main(String[] args) {

		String s1 = "hello world";
		StringBuilder s2 = new StringBuilder("world");

		String s3 = s1.replace(s2, "java");
		System.out.println(s3);
	}
}

package ch08.lecture.p03polymorphism;

public class C04Polymorphism {
	public static void main(String[] args) {

		CharSequence[] arr = new CharSequence[10];
		arr[0] = new String("java");
		arr[1] = "hello";
		arr[2] = new StringBuffer("world");
		arr[3] = new StringBuilder("spring");

		char c1 = arr[0].charAt(0);
		char c2 = arr[1].charAt(0);
		char c3 = arr[2].charAt(0);
		char c4 = arr[3].charAt(0);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}
}

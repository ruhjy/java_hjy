package ch12.lecture.p01object;

public class C17Hashcode {
	public static void main(String[] args) {
		
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
	}
}

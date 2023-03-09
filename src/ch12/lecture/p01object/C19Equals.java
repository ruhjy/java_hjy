package ch12.lecture.p01object;

public class C19Equals {
	public static void main(String[] args) {
		
		Object o1 = new MyClass19();
		Object o2 = new MyClass19();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		System.out.println(o1.equals(o3));
		System.out.println(o1.equals(o2));
		System.out.println(o3.equals(o1));
		System.out.println(o2.equals(o1));
		
		
	}
}

class MyClass19 {

	@Override
	public int hashCode() {
		return 33;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}

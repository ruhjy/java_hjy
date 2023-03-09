package ch12.lecture.p01object;

public class C16Hashcode {
	public static void main(String[] args) {
		
		Object o1 = new MyClass16();
		Object o2 = new MyClass16();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
	}
}

class MyClass16 {
	
	@Override
	public int hashCode() {
		return 99;
	}
}

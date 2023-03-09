package ch12.lecture.p01object;

public class C21Equals {
	public static void main(String[] args) {

		Object o1 = new MyClass21(5);
		Object o2 = new MyClass21(5);
		Object o3 = new MyClass21(6);

		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o1.equals(o2)); // true
		System.out.println(o1.equals(o3)); // false
	}
}

class MyClass21 {

	private int id;

	public MyClass21(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof MyClass21 o) {
			return this.id == o.id;
		}
		return false;
	}

}
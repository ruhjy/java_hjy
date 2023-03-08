package ch12.lecture.p01object;

public class C08Record {
	public static void main(String[] args) {
		MyClass08 o = new MyClass08("son", 33);
		System.out.println(o);

		System.out.println(o.getName());
		System.out.println(o.getAge());
	}
}

class MyClass08 {
	private final String name;
	private final int age;

	public MyClass08(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "MyClass08 [name=" + name + ", age=" + age + "]";
	}
}

package ch12.lecture.p01object;

import java.util.*;

public class C24HashCodeEquals {
	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(new MyClass24(1, "kim"));
		set.add(new MyClass24(2, "edman"));
		set.add(new MyClass24(1, "kim"));

		System.out.println(set.size());

	}
}

class MyClass24 {

	private int id;
	private String name;

	public MyClass24(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass24 other = (MyClass24) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

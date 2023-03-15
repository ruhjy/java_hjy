package ch15.lecture.p02collections;

import java.util.*;

public class C03Compare {
	public static void main(String[] args) {

		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 40));
		list.add(new Person03("kim", 40));

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

	}
}

class Person03 implements Comparable<Person03> {

	private String name;
	private int age;

	public Person03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person03 [name=" + name + ", age=" + age + "]";
	}

	// Comparable<T> 인터페이스 구현
	@Override
	public int compareTo(Person03 o) {
//		return (this.age - o.age) * -1; // 나이 역순 정렬
		return this.age - o.age; // 나이순 정렬
//		return this.name.compareTo(o.name); // 이름순 정렬
//		if (this.age == o.age) { // 나이가 같으면 이름순으로 정렬
//			return this.name.compareTo(o.name);
//		} else {
//			return this.age - o.age;
//		}
	}

}
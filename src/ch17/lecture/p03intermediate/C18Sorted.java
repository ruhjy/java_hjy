package ch17.lecture.p03intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {

		List<Car> list = List.of(
				new Car("genesis", 7000),
				new Car("avante", 2500),
				new Car("tesla", 5000),
				new Car("morning", 1500));

		// 가격 순
		list.stream()
				.sorted()
				.forEach(System.out::println);
		System.out.println();

		// 이름 순
		list.stream()
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.forEach(System.out::println);
		System.out.println();

		// 가격 역순
		list.stream()
				.sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
				.forEach(System.out::println);
		System.out.println();

		list.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

	}
}

class Car implements Comparable<Car> {

	private String name;
	private int price;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car o) {
		return this.price - o.price;
	}

}
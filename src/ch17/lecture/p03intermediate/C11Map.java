package ch17.lecture.p03intermediate;

import java.util.*;

public class C11Map {
	public static void main(String[] args) {

		List<Book> list = List.of(
				new Book("slamdunk", 3000),
				new Book("avatar", 4000),
				new Book("the golory", 5000),
				new Book("avengers", 2000));

//		Integer sum = list.stream().map(b -> b.getPrice()).reduce((a, b) -> a + b).get();
//		.reduce((a, b) -> a.sum(a, b))
		int sum = list.stream()
				.map(b -> b.getPrice())
				.reduce(Integer::sum)
				.get();
		System.out.println("sum : " + sum);

		int sum2 = list.stream()
//				.mapToInt(b -> b.getPrice())
				.mapToInt(Book::getPrice)
				.sum();
		System.out.println("sum2 : " + sum2);

		double avg = list.stream()
				.mapToInt(Book::getPrice)
				.average()
				.getAsDouble();
		System.out.println("avg : " + avg);

	}
}

class Book {

	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
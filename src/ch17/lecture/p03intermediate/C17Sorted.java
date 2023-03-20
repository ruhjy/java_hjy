package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {

		List<Movie> movie = List.of(
				new Movie("avater", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000));

		// price 기준 오름차순
		movie.stream()
				.sorted((o1, o2) -> o1.getPrice() - o2.getPrice())
				.forEach(System.out::println);
		System.out.println();

		// title 기준 오름차순
		movie.stream()
				.sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()))
				.forEach(System.out::println);

	}
}

class Movie {

	private String title;
	private int price;

	public Movie(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", price=" + price + "]";
	}

}

package ch15.lecture.p07treeset;

import java.util.*;

public class C04Comparable {
	public static void main(String[] args) {

//		TreeSet<Movie> set = new TreeSet<>((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()));
		TreeSet<Movie> set = new TreeSet<>();
//		HashSet<Movie> set = new HashSet<>();
		set.add(new Movie("topgun"));
		set.add(new Movie("avengers"));
		set.add(new Movie("slamdunk"));
		set.add(new Movie("avatar"));
		set.add(new Movie("slamdunk"));
		set.add(new Movie("slamdunk"));
		set.add(new Movie("slamdunk"));

		System.out.println(set);
	}
}

// getter, setter, constructor, toString, hashCode/equals
//class Movie implements Comparable<Movie> {
//	private String title;
//
//	public Movie(String title) {
//		this.title = title;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
////	@Override
////	public int hashCode() {
////		return Objects.hash(title);
////	}
////
////	@Override
////	public boolean equals(Object obj) {
////		if (this == obj)
////			return true;
////		if (obj == null)
////			return false;
////		if (getClass() != obj.getClass())
////			return false;
////		Movie other = (Movie) obj;
////		return Objects.equals(title, other.title);
////	}
//
//	@Override
//	public String toString() {
//		return "title=" + title;
//	}
//
//	@Override
//	public int compareTo(Movie o) {
//		// 이 객체가 파라미터 보다 작으면 음수
//
//		// 같으면 0
//
//		// 이 객체가 파라미터 보다 크면 양수
//		return this.title.compareTo(o.title);
//	}
//
//}

class Movie implements Comparable<Movie> {
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(title);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Movie other = (Movie) obj;
//		return Objects.equals(title, other.title);
//	}

	@Override
	public String toString() {
		return "title=" + title;
	}

	@Override
	public int compareTo(Movie o) {
		return this.title.compareTo(o.title);
	}

}

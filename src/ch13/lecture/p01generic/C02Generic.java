package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {

		MyClass02<String> o1 = new MyClass02<String>();
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());

		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		System.out.println(sc.hasNext());

		// 기본타입은 타입아규먼트로 사용불가하므로 wrapper type 사용
		MyClass02<Integer> o3 = new MyClass02<Integer>();
//		o3.setItem(Integer.valueOf(3));
		o3.setItem(3); // auto boxing
		int i1 = o3.getItem(); // auto unboxing
		System.out.println(i1);

	}

}

// generic type
// T : type parameter
// type parameter 명 작성 관습 : 대문자 한글자
// https://docs.oracle.com/javase/turorial/java/generics/types.html
class MyClass02<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
package ch05.lecture.p04string;

import java.util.Arrays;

public class C03Split {
	public static void main(String[] args) {
		// split
		// 특정 문자패턴으로 문자열을 나누어서 배열로 리턴

		String str1 = "hello,java,world,html,css";
		String[] arr1 = str1.split(",");

		System.out.println(arr1.length); // 5
		System.out.println(arr1[0]); // hello
		System.out.println(arr1[4]); // css
		System.out.println(Arrays.toString(arr1));
		System.out.println();

		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");

		System.out.println(arr2.length); // 6
		System.out.println(arr2[0]); // spring
		System.out.println(arr2[arr2.length - 1]); // sass
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");
		
		System.out.println(arr3.length); // 12
		System.out.println(arr3[0]); // I
		System.out.println(arr3[arr3.length - 1]); // .
		System.out.println(Arrays.toString(arr3));
		
	}
}

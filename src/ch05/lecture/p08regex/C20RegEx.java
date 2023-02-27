package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = "  al ad ala      aldadf a as        asdfasdf      ;adflkajsf    a  ";
		String str2 = str1.replaceAll("\\s+", "");

		System.out.println(str1);
		System.out.println(str2); // aladalaaldadfaasasdfasdf;adflkajsfa
		System.out.println();

		String str3 = "asdfas   ,    lasdfadf,sgaa,s  ssdfkljs   ,   skdfjsf";
		String[] str4 = str3.split("\s*,\s*");

		System.out.println(Arrays.toString(str4)); // [asdfas, lasdfadf, sgaa, s ssdfkljs, skdfjsf]

	}
}

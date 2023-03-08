package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C05Instanceof {
	public static void main(String[] args) {
//		method("java");
//		method(new StringBuilder("java"));
		method(new StringBuffer("java"));
		
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);
		System.out.println(c instanceof CharSequence);
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Comparable);
		System.out.println(c instanceof Serializable);
		System.out.println(c instanceof Constable);
		System.out.println(c instanceof ConstantDesc);
	}
}

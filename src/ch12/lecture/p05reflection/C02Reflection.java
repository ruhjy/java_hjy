package ch12.lecture.p05reflection;

import java.lang.reflect.*;
import java.util.*;

public class C02Reflection {
	public static void main(String[] args) {
		
		Class class1 = String.class;
		
		// 이름(full name)
		System.out.println(class1.getName());
		
		// 이름(simple name)
		System.out.println(class1.getSimpleName());
		System.out.println();
		
		// 패키지
		System.out.println(class1.getPackageName());
		System.out.println(class1.getPackage());
		System.out.println();
		
		// 생성자
		Constructor[] constructors = class1.getConstructors();
//		System.out.println(Arrays.toString(constructors));
		System.out.println();
		
		// 필드
		Field[] fields = class1.getFields();
//		System.out.println(Arrays.toString(fields));
		System.out.println();
		
		// 메서드
		Method[] methods = class1.getMethods();
		System.out.println(Arrays.toString(methods));
	}
}

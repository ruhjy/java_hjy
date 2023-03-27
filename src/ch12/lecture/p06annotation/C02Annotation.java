package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C02Annotation {
	public static void main(String[] args) {

		Class c1 = MyClass02.class;
		Annotation[] annotations = c1.getAnnotations();
		System.out.println(annotations.length);
	}
}

@MyAnnotation02
class MyClass02 {

}

@Retention(RetentionPolicy.RUNTIME) // 어노테이션의 유지 정책
@interface MyAnnotation02 {

}
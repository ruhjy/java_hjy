package ch12.lecture.p06annotation;

public class C08Annotation {

}

class MyClass08 {

	@MyAnnotation08
	int f1;
	@MyAnnotation08(100)
	int f2;
	@MyAnnotation08(value = 100)
	int f3;
	
	// value는 생략 가능하지만 다른 속성에도 값을 주려면 value 속성의 이름도 입력해야한다.
	@MyAnnotation08(value = 100, name = "lee", age = 33)
	int f4;
}

@interface MyAnnotation08 {

	int value() default 0;

	String name() default "kim";

	int age() default 0;
}

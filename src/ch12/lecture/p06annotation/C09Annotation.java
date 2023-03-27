package ch12.lecture.p06annotation;

public class C09Annotation {

}

class MyClass09 {

	// 배열일 경우에는 { } 안에 ,를 구분자로 기입
	@MyAnnotation09(val1 = "hi", val2 = { "a", "b" })
	int f1;
	@MyAnnotation09(val1 = "hi", val2 = { "a" })
	int f2;
	
	// 들어갈 값이 하나이면 { } 생략 가능
	@MyAnnotation09(val1 = "hi", val2 = "a")
	int f3;
}

@interface MyAnnotation09 {

	String val1();

	String[] val2();
}

package ch12.sec12;

import java.lang.annotation.*;

// 적용 대상 : method, 유지 정책 : runtime 
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}

package etc.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation04
public class App04 {
    @MyAnnotation04(name = "trump", age = 99)
    public void method() {
    }


    @MyAnnotation05(address = "seoul", age = 88)
    public void method2() {

    }

    @MyAnnotation05(age = 99)
    public void method3() {

    }

    @MyAnnotation06(name = {"trump", "donald"})
    public void method4() {

    }

    @MyAnnotation06(name = "trump")
    public void method5() {

    }

    @MyAnnotation07(name = "trump", value = "hello")
    public void method6() {

    }

    @MyAnnotation07(value = "hello")
    public void method7() {

    }

    // value 만 존재할 때 속성명 생략 가능
    @MyAnnotation07("hello")
    public void method8() {

    }
}

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
    String[] name() default "donald";

    String address() default "seoul";

    int age() default 0;

    String value() default "";

}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation06 {
    String[] name();
}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String address() default "busan";

    // 이 있다면 위에 어노테이션 옆에 적어줘야함
    // 디폴트 값이 있다면 안써줘도 된다.
    int age();
}


@Target({ElementType.METHOD})
// 부가적인 정보를 어떻게 넣을 수 있는가
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {

    // elmetn, attribute, 속성
    String name();

    int age();


}



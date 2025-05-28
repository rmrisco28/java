package etc.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation03
public class App03 {
    @MyAnnotation03
    private int val;

    @MyAnnotation03
    App03() {

    }

    @MyAnnotation03
    public void method(int param) {
        @MyAnnotation03
        int value;
    }
}

// target에 어디에 붙일 것인지 결정.
@Target({
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.PARAMETER,
        ElementType.LOCAL_VARIABLE,
        ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
    // 이걸 보고 어떤 행동을 취하라고

}

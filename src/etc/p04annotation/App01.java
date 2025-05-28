package etc.p04annotation;

public class App01 {
    public static void main(String[] args) {

    }
}

// annotation
@FunctionalInterface
interface MyInterface {
    void method();
}


class Book {
    // annotaion
    @Override
    public String toString() {
        return super.toString();
    }
}

// annotation: 코드의 부가 정보
// 어디선가 이 부가 정보를 보고 어떤 행동을 취하라고 알려줌.
// spring framwork가 어떤 정보를 취함. 어노테이션을 굉장히 많이 쓸 것.
// 스프링이 이걸 보고 어떻게 작동을 하는지도 배우는 것.
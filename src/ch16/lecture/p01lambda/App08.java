package ch16.lecture.p01lambda;

public class App08 {
    public static void main(String[] args) {
        MyInterface08 a = () -> System.out.println();
        MyInterface08 b = new MyInterface08() {
            @Override
            public void some() {
                System.out.println();
            }
        };
        // 람다 코드가 특정 인스턴스 메소드 호출 코드만 있다면
        // 그리고 파라미터 목록이 같으면
        // 메소드 참조 :: 로 코드 줄일 수 있음
        MyClass08 o = new MyClass08();
        MyInterface08 c = () -> o.action();
        // 형광펜에서 alt + enter 해보면 코드를 수정 할 수 있다.
        MyInterface08 d = o::action;
        MyInterface08 e = o::action;
        // 목록이 어떤 파라미터 목록과 같다면,

    }
}

class MyClass08 {
    void action() {

    }
}

@FunctionalInterface
interface MyInterface08 {
    void some();
}
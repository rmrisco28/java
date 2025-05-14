package ch16.lecture.p01lambda;

public class App07 {
    public static void main(String[] args) {
        MyInterface07 a = new MyInterface07() {
            @Override
            public int method() {
                // 코드에 꼭 리턴 타입에 맞는 return문을 만나도록 코드 작성
                if (true) {
                    return 3;
                }
                return 5;
            }
        };

        MyInterface07 b = () -> {
            // 코드에 꼭 리턴 타입에 맞는 return문을 만나도록 코드 작성
            if (true) {
                return 3;
            }
            return 5;
        };

        MyInterface07 c = new MyInterface07() {
            @Override
            public int method() {
                return 5;
            }
        };
        // 리턴 값을 내야할땐 중괄호를 써야하는데,
        // 만약에 body에 리턴문 하나만 있을때 return문도 생략해야함.
        MyInterface07 d = () -> 5;
    }
}

@FunctionalInterface // 써도되고 안써도 되고
interface MyInterface07 {
    int method();
}

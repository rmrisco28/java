package ch16.lecture.p01lambda;

public class App03 {
    public static void main(String[] args) {
        //파라미터가 없는 경우는 그대로 빈칸으로 두면됨.
        MyInterface03 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        a.method();

        //method body의 코드가 여러줄이면 {중괄호} 꼭 써야함
        MyInterface03 b = () -> {
            System.out.println("code11");
            System.out.println("code12");
        };
        b.method();

        // method body코드가 한줄이면 {중괄호} 생략가능
        MyInterface03 c = () -> System.out.println("code99");
        c.method();
    }
}


interface MyInterface03 {
    // 파라미터 없는 메소드
    void method();
}
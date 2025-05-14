package ch16.sec01;

@FunctionalInterface // 꼭 추상 메소드가 한개 있어야한다.
// 필드가 들어가거나 static method, default method, private 메소드 들어가도 상관없음
public interface Calculable {
    //@formatter:off
    int max = 0;
    static void method(){}
    private static void method3(){}
    default void method4(){}
    private void method5(){}

    // 추상 메소드
    void calculate(int x, int y);
}

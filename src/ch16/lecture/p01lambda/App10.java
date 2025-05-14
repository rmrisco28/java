package ch16.lecture.p01lambda;

import java.io.InputStream;
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        // 생성자가 없다면 아래처럼 줄일 수 있다.
        MyInterface10 a = () -> new Object();
        MyInterface10 b = Object::new;


        // 파라미터가 같다면 생성자 참조로 줄일 수 있다.
        MyInterface11 c = x -> new StringBuffer(x);
        MyInterface11 d = StringBuffer::new;


        // 파라미터 목록이 같다면 생성자 참조로 줄일 수 있다.
        Myinterface12 e = (x, y) -> new Scanner(x, y);
        Myinterface12 f = Scanner::new;
    }
}

interface Myinterface12 {
    void action(InputStream a, String b);

}


interface MyInterface11 {
    void action(String a);
}

interface MyInterface10 {
    void action();

}



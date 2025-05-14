package ch08.lecture.p04api;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        // Object
        Object b = s;
        // Closeable
        Closeable c = s;
        // AutoCloseable
        AutoCloseable d = s;
        // Iterator
        Iterator i = s;

        System.out.println(s instanceof Scanner);
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Closeable);
        System.out.println(s instanceof AutoCloseable);
        System.out.println(s instanceof Iterator);

        c.close(); // c
//        c.nextLine();// x
        Scanner c1 = (Scanner) c;
        
        c1.nextLine(); // 26번줄에서 닫혀서 실행이 안됨
    }
}

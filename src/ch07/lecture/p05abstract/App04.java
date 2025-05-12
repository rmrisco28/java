package ch07.lecture.p05abstract;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;

public class App04 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        AbstractList b = a;
        AbstractCollection c = a;
        Object d = a;

        System.out.println(a instanceof ArrayList);
        System.out.println(a instanceof AbstractList);
        System.out.println(a instanceof AbstractCollection);
        System.out.println(a instanceof Object);


        System.out.println(b instanceof ArrayList);
        System.out.println(b instanceof AbstractList);
        System.out.println(b instanceof AbstractCollection);
        System.out.println(b instanceof Object);

        System.out.println(c instanceof ArrayList);
        System.out.println(c instanceof AbstractList);
        System.out.println(c instanceof AbstractCollection);
        System.out.println(c instanceof Object);

        System.out.println(d instanceof ArrayList);
        System.out.println(d instanceof AbstractList);
        System.out.println(d instanceof AbstractCollection);
        System.out.println(d instanceof Object);
    }
}




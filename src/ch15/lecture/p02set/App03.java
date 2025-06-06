package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class App03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("java"); // 중복된건 저장하지 않는다.
        System.out.println("set = " + set);

        System.out.println();
        Book03 b1 = new Book03("java", 3000);
        Book03 b2 = new Book03("git", 4000);
        Book03 b3 = new Book03("java", 3000);

        Set<Book03> set2 = new HashSet<>();
        boolean r1 = set2.add(b1);
        boolean r2 = set2.add(b2);
        boolean r3 = set2.add(b3);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        set2.forEach(System.out::println);
        // 이렇게 하면 다르게 나옴.
        // 하지만 밑에서 equals, hashcode 생성.
    }
}

class Book03 {
    private String title;
    private Integer price;

    public Book03(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book03{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book03 book03 = (Book03) object;
        return Objects.equals(title, book03.title) && Objects.equals(price, book03.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}

package etc.lecture.p03reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App02 {
    public static void main(String[] args) {
        Class<Book> c = Book.class;
        Field[] field = c.getDeclaredFields();
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        Method[] method = c.getDeclaredMethods();


        System.out.println("field = " + field.length);
        System.out.println("constructors = " + constructors.length);
        System.out.println("method = " + method.length);
    }
}

class Book {
    // 생성자 2개 , getters, setters, to String
    private String title;
    private Integer price;

    public Book() {

    }

    public Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

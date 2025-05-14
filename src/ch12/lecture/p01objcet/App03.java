package ch12.lecture.p01objcet;

public class App03 {
    public static void main(String[] args) {
        Book03 a = new Book03();
        Book03 b = new Book03();

        a.setTitle("이것이 자바다");
        b.setTitle("이것이 자바다");

        // 같은 참조값인가?
        System.out.println(a == b); // false

        // equalse 내용물이 같은가?
        System.out.println(a.equals(b)); // false
    }
}

class Book03 {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

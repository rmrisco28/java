package practice.d250522_stream01.d250523_java.ChatGPT;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    void showInfo() {
        System.out.println("책 제목: " + title);
        System.out.println("책 저자: " + author);
    }
}

class C {
    int[] a = new int[10];

    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("감자의 세상", "김감자");
        books[1] = new Book("고구마의 왕자", "고구마");
        books[2] = new Book("농작물세상", "소작농");
        for (int i = 0; i < books.length; i++) {

            books[i].showInfo();
            System.out.println();
        }


    }
}
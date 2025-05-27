package ch18.lecture.p05filter;

import java.io.*;

public class App10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 직렬화 가능한 객체만
        // ObjectInputStream, ObjcetOutputStream으로
        // 역질렬화, 직렬화 가능

        Book10 book = new Book10("java", 3000);

        String file = "C:/Temp/filter10.txt";
        // 객체를 직렬화로 파일에 쓰기
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        try (oos; os) {
            // 모든 객체가 직렬화 되는 것아니고, 참조한 클래스에 Serializable 있어야함.
            oos.writeObject(book);
            oos.flush();
        }

        // 파일에 있는 데이터 읽어서 역직렬화 해서 객체로 얻기
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);

        try (ois; is) {
            Object o = ois.readObject();
            if (o instanceof Book10 b) {
                System.out.println("b = " + b);
            }
        }

    }
}

// Seriolizable 인터페이스를 구현한 클래스의 객체만 직렬화(역직렬화) 가능
class Book10 implements Serializable { // 직렬화
    private String title;
    private Integer prica;


    // 생성자, toString getter, setter
    public Book10(String title, Integer prica) {
        this.title = title;
        this.prica = prica;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrica() {
        return prica;
    }

    public void setPrica(Integer prica) {
        this.prica = prica;
    }

    @Override
    public String toString() {
        return "Book10{" +
                "title='" + title + '\'' +
                ", prica=" + prica +
                '}';
    }
}
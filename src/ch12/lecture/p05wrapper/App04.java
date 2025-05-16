package ch12.lecture.p05wrapper;

public class App04 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        System.out.println("b1.getTitle() = " + b1.getTitle()); // null
        System.out.println("b1.getPrice() = " + b1.getPrice()); // 0

        Book2 b2 = new Book2();
        System.out.println("b2.getTitle() = " + b2.getTitle()); // null
        System.out.println("b2.getPrice() = " + b2.getPrice()); // null
        // 책을 팔때 0원이냐, 아니면 값이 정해져있지 않냐 할때, null값이 더 유용함.
        // 이럴때 wrapper 를 사용해서 빈 값을 주어 사용한다.
    }
}

class Book2 {
    private String title;
    // null 값을 갖고있는 특징 때문에
    private Integer price;

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


class Book1 {
    // 참조값이기때문에 기본값이 null
    private String title;
    // 기봍아입이기때문에 기본값이 0
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
} 

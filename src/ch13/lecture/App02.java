package ch13.lecture;

public class App02 {
    public static void main(String[] args) {
        Box02 b = new Box02();
        b.setItem(4.13);
        Number item1 = b.getItem();
        System.out.println("item1 = " + item1);
    }
}

class Box02 {

    private Number item;

    public Number getItem() {
        return item;
    }

    public void setItem(Number item) {
        this.item = item;
    }
}

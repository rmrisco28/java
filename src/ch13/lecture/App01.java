package ch13.lecture;

public class App01 {
    public static void main(String[] args) {
        Box01 box = new Box01();
        box.setItem(99);

        Integer v = box.getItem();
        System.out.println("v = " + v);

//        box.setItem(3.14); // double로 불가.
        // 기본타입 double에서 int로 바꿀 수 없지만,  int 에서 double로 바꿀 순 있음.
        // 참조타입

    }
}

class Box01 {
    private Integer item;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}

package ch13.lecture;

public class App04 {
    public static void main(String[] args) {
        Box04<Integer> b1 = new Box04<Integer>();

        b1.setItem(99);
//        b1.setItem(3.14);
        Integer item1 = b1.getItem();
        System.out.println("item1 = " + item1);

        Box04<Double> b2 = new Box04<>();
        Double item2 = b2.getItem();
        System.out.println("item2 = " + item2);

        Box04<String> b3 = new Box04<String>();
        b3.setItem("java");
        String item3 = b3.getItem();
        System.out.println("item3 = " + item3);
    }
}

// generic type: 아직 결젇되지 않은 타입
// <T> 타입 파라미터
// 꼭 T로 쓰지 않아도 됨. 원문이 Type parameter라 T라 쓰는거지, 아무거나 써도 됨.
// 관습상 T로 많이씀
class Box04<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
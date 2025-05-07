package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
//        String hobby = new String("여행"); 사실은 이렇게 쓰는게 맞음.
        String hobby = "여행";
        hobby = null; // hobby는 쓰레기. 여기서 청소.

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 = " + kind2);
    }
}

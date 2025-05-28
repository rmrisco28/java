package etc.lecture.p02enum;

public class App01 {
    public static void main(String[] args) {
        var val1 = Values.TIGER;
        var val2 = Values.EAGLE;

        // 사용할땐
        Animals v3 = Animals.LION;
        Animals v4 = Animals.EAGLE;
        var v5 = Animals.BULL;

        System.out.println(v3.name());
        System.out.println(v4.name());

        System.out.println(v3.ordinal()); // 1
        System.out.println(v3.ordinal()); // 3

        String s1 = "TIGER";
        Animals v6 = Animals.valueOf(s1);
        System.out.println("v6 = " + v6);
        System.out.println(v6 == Animals.TIGER); // TIGER와 v6의 참조값은 완전히 같다.
    }
}

// enum 없이

class Values {
    public static final int TIGER = 1;
    public static final int LION = 2;
    public static final int EAGLE = 3;
    public static final int BULL = 4;

}

// enum: 값들을 나열한 타입
enum Animals {
    TIGER, LION, EAGLE, BULL
}
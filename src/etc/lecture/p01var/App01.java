package etc.lecture.p01var;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 5;
        // var 변수의 타입이 추론 가능 할때 var 사용 가능
        var c = 7;
        var d = 7L;
//        var e; // 무엇인지 알 수 없기때문에 불가능
        var f = "java";

        var list = List.of(9, 1, 2); // List<Integer> list = List.of(9, 1, 2);

        ArrayList<Object> list3 = new ArrayList<>();
        var list4 = new ArrayList<>(); //ArrayList<Object> list4 = new ArrayList<>();

    }

}

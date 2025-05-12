package ch06.lecture.p11etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// static import : static member를 클래스 명시 없이 사용 가능
//import static java.lang.Math.random;
//import static java.lang.Math.PI;
// 위 두개 import도 Math.*로 인해 필요없어짐
import static java.lang.Math.*;

public class C01ImportStatic {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용할 때 import
        //ex
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        // import 해서 앞에 Math가 필요없어짐.1
        random();

//         double v = Math.PI*10; 도 위 import 했기때문에 Math 필요없어짐
        double v = PI * 10;
    }
}

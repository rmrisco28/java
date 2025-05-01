package ch04.lecture;

public class C19for {
    public static void main(String[] args) {
        // 2*1 2*2 ... 2*9
        // 3*1 3*2 ... 3*9

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단####################");
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}

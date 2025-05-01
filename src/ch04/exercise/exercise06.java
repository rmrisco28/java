package ch04.exercise;

public class exercise06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("___________________");
        String s = "*";
        for (int i = 0; i < 5; i++, s += "*") {
            System.out.println(s);
        }

    }
}

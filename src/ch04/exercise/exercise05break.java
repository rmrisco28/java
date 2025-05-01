package ch04.exercise;

public class exercise05break {
    public static void main(String[] args) {
/*
        int x = 1;
        int y = 1;
        while ((4 * x) + (5 * y) == 60) {

            while ((4 * x) + (5 * y) == 60) {
                y++;
            }
            x++;
            break;
            }

*/

        int y = 1;
        for (int x = 1; x <= 10; x++) {

            for (y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(x + "," + y);
                    break;
                }
            }
            if ((4 * x) + (5 * y) == 60) {
                break;
            }
        }
    }
}


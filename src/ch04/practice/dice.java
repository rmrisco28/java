package ch04.practice;

public class dice {
    public static void main(String[] args) {

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;

        int i = 0;
        while (i < 100000) {
            int a = (int) (Math.random() * 6) + 1; // 주사위 뽑기
            switch (a) {
                case 1 -> a1++;
                case 2 -> a2++;
                case 3 -> a3++;
                case 4 -> a4++;
                case 5 -> a5++;
                case 6 -> a6++;
            }
            i++;
        }
        System.out.println(a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "," + a6);

    }

}

package ch03.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // 11 20-1
        System.out.println("z = " + z); // 31
    }
}

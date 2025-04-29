package ch03.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        // 사다리꼴 공식: (윗변+아랫변) *높이 /2
        int lenghTop = 5;
        int lengthBottom = 10;
        int height = 7;
//        double area = (lenghTop + lengthBottom) * height / 2.0;
//        double area = (lenghTop + lengthBottom) * height * 1.0 / 2;
//        double area = (double) (lenghTop + lengthBottom) * height / 2;
        double area = (double) ((lenghTop + lengthBottom) * height / 2);
        System.out.println(area);
    }
}

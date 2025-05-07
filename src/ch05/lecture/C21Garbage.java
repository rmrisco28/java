package ch05.lecture;

import java.util.Arrays;

public class C21Garbage {
    public static void main(String[] args) {
        int[] a = new int[]{5, 66};
        int[] b = new int[]{10, 20};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = new int[]{100, 200,};
        System.out.println(Arrays.toString(b));
        // 이때 전 b 값을 사용하지 않기 때문에 쓰레기 자료로 취급.
    }
}

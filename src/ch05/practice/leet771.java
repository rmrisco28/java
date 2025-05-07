package ch05.practice;

public class leet771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        char[] a = jewels.toCharArray();
        char[] b = stones.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}

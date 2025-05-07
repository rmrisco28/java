package ch05.practice;

public class leet125 {
    public static void main(String[] args) {
        //해야하는 일
        // 1. 대소문자 통일

        String s = "race a car";
        String a = s.toLowerCase();
        System.out.println("a = " + a);

        // 2. 특수기호 제거
        String b = a.replace(",", "");
        String c = b.replace(":", "");
        String d = c.replace(" ", "");
        System.out.println("d = " + d);


        // 3. 뒤집기
        System.out.println("d.length() = " + d.length());
        String x = "";

//        for (int i = 0; i < d.length(); i++) {
//            x += d.substring(d.length() - 1 - i, d.length() - i);
//        }

        for (int i = d.length() - 1; i >= 0; i--) {
            x += d.charAt(i);
        }

        System.out.println("x = " + x);
        System.out.println("d.equals(x) = " + d.equals(x));

    }
}

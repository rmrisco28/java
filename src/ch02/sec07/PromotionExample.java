package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intvalue = " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("charValue = " + charValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longvalue = " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("longValue = " + longValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}

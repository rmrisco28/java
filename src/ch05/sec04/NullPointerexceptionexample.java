package ch05.sec04;

public class NullPointerexceptionexample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
        
        String str = null;
        System.out.println("총 문자 수 : " + str.length());
    }
}

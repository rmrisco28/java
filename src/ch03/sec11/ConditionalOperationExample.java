package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println("grade = " + grade);

        int s = 85;
        String result = (!(s > 90)) ? "가" : "나";
        System.out.println("result = " + result);
    }
}

package ch07.lecture.p05abstract;

public class App05 {
    public static void main(String[] args) {
        String a = "java";
        // 자동 형변환
        Object b = a; // 스트링은 오브젝트를 상속받았기 때문에 가능

        // String.hashCode() 가 실행됨
        int c = b.hashCode();
        System.out.println(c);
    }
}

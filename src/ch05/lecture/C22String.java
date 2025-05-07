package ch05.lecture;

public class C22String {
    public static void main(String[] args) {
        // 기본타입 8개 외에는 모두 참조타입
        // Sting 별명: 9번째 기본타입
        String a = "java"; // new 생략 가능
        String f = "java";
        System.out.println(a == f); // true

        String g = "ja";
        String h = "va";
        String i = g + h;
        System.out.println(a == i); // false


        String b = new String("java"); // 정석
        String c = new String("react");
        System.out.println(b == c);

        String d = new String("java");
        String e = new String("java");
        System.out.println(d == e); // false

        // 결론: String의 문자열의 내용이 같은지 확인할 때,
        // == 쓰지 말 것. -> .equasl()
        // intellij에서 힌트를 주니, alt enter로 수정 가능.(안해도 됨.)
    }
}

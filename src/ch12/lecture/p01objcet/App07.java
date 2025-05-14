package ch12.lecture.p01objcet;

public class App07 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");
        String c = new String("react");

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a.equals(c));
        System.out.println(c.hashCode());

        // System.identifyHasnCode();
        // 가끔 우리는 원래 재정의하지 않은 오브젝트의 hashCode값이 필요할때
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
    }
}

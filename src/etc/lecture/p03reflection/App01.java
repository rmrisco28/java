package etc.lecture.p03reflection;

public class App01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // reflection의 사전적 의미: 반영하다, (거울에) 반사되다, 비치다
        // 어떤 정보를 얻어왔으면 Class Class 객체가 만들어짐
        // 클래스라는 타입의 객체가 만들어짐
        String s1 = "java";

        // reflection:  class 정보를 얻는것
        Class<String> c1 = String.class;
        Class<?> c2 = Class.forName("java.lang.String");

        Class<? extends String> c3 = s1.getClass();

        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));
        System.out.println(System.identityHashCode(c3)); // 다 같은 참조값을 가리킴.
        // 다 클래스라는 객체를 가리키기 때문에.

    }
}

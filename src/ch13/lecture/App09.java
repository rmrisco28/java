package ch13.lecture;

public class App09 {
    public static void main(String[] args) {
        MyClass09 a = new MyClass09();
        a.<Integer>action();
        a.<String>action();

        String v1 = a.<String>action1();
        String v2 = a.action1();
        // 위에 String 안써도됨

        a.<Integer>action2(3);
        a.action2(3); // 어차피 무슨 타입인지 아니까 안써도 된다.

        a.action2("java");
        
    }

}

class MyClass09 {
    public <T> void action() {
        //retunr 타입 결정
    }

    public <T> T action1() {
        return null;
    }

    public <T> void action2(T param) {

    }
}


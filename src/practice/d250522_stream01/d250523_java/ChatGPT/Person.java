package practice.d250522_stream01.d250523_java.ChatGPT;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 [" + name + "]이고, 나이는 [" + age + "]살 입니다.");
    }

    void haveBirthdat() {
        age++;
        System.out.println("생일 축하합니다. 현재 나이는 [" + age + "]살 입니다.");
    }
}

class B {
    public static void main(String[] args) {
        Person person = new Person("철수", 25);
        person.introduce();
        person.haveBirthdat();
    }

}

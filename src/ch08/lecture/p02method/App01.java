package ch08.lecture.p02method;

public class App01 {
    public static void main(String[] args) {
        // interface로 인스턴스 만들 수없음
//        Beast1 a = new Beast1();

        Tiger1 t = new Tiger1();
        Wolf1 w = new Wolf1();

        Beast1 b = t;
        Beast1 c = w;
        b.hunt();
        c.hunt();
    }
}

interface Beast1 {
    // 인터페이스로 인스턴스 만들 수 없음.
    // 인터페이스의 메소드는 모두 public, abstract method
    // 몸통이 없어야함.
    public abstract void hunt();
}

// abstract 클래스가 되지 않으려면 반드시 재정의해줘야함
class Tiger1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("초식동물들을 사냥합니다.");
    }
}

class Wolf1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("작은동물들을 사냥합니다.");
    }
}


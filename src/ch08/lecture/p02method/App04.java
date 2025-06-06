package ch08.lecture.p02method;

public class App04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.walk();
        hero.pickWeapon(new Sword());
        hero.attack();
        System.out.println();

        hero.walk();
        hero.pickWeapon(new Gun());
        hero.attack();
        System.out.println();

        hero.walk();
        hero.pickWeapon(new Bow());
        hero.attack();

    }
}

interface Weapon {
    void use();
}

class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("칼을 휘두릅니다.");
    }
}

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("총을 쏩니다.");
    }
}

class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("활을 쏩니다.");
    }
}


class Hero {
    //무기 저장할 필드
    private Weapon weapon; // 인터페이스로 구현


    public void walk() {
        System.out.println("걸어갑니다.");
    }

    public void pickWeapon(Weapon weapon) {
        System.out.println("무기를 획득합니다.");
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("공격합니다.");
        weapon.use(); // 인스턴스가 있다는건, 추상메소드가 없다는사실. 무조건 실행된다는보장이 있음.
    }
}

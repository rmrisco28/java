package ch06.exercise.p20;

public class Account {
    private String num;
    private String name;
    private int money;

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}

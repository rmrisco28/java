package ch06.exercise.p19;

public class Account {
    // 필드 선언
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;

        }

    }

    public int getBalance() {
        return balance;
    }
}

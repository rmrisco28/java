package practice.d250522_stream01.d250523_java.ChatGPT;

public class Car {
    private String model;
    private int year;
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;

    }

    void displayInfo() {
        System.out.println(model);
        System.out.println(year);
    }

    void accelerate(int amount) {
        speed += amount;
        System.out.println(speed);

    }

}

class A {
    public static void main(String[] args) {
        Car car = new Car("소나타", 2020);
        car.displayInfo();

        car.accelerate(3);

    }


}

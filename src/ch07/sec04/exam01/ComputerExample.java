package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator a = new Calculator();
        System.out.println("원 면적: " + a.areaCircle(r));
        System.out.println();
        
        Computer b = new Computer();
        System.out.println("원 면적: " + b.areaCircle(r));
    }
}

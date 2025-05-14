package ch12.lecture.p03math;

import java.util.Random;

public class App02 {
    public static void main(String[] args) {
        //math.random() : 0.0d <=  x <1.0d 임의의 수
        System.out.println(Math.random());

        double dice = Math.floor(Math.random() * 6) + 1;
        System.out.println("dice = " + dice);

        //random: 임의의 수 뽑아주는객체
        Random r = new Random();
        int a = r.nextInt();
        System.out.println("a = " + a);

        // nextDouble: 0.0d <= x <1.0d 임의의 수 뽑기
        double v = r.nextDouble();
        System.out.println("v = " + v);

        // nextInt(): 임의의 정수
        int i = r.nextInt();
        System.out.println("i = " + i);

        //nextInt(bound): 0~bound 사이의 정수
        int i1 = r.nextInt(6); // 0,1,2,3,4,5
        System.out.println("i1 = " + i1);

        //주사위 처럼 만들기
        int i2 = r.nextInt(6) + 1;
        System.out.println("i2 = " + i2);


    }
}

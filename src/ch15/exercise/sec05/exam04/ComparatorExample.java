package ch15.exercise.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        // 비교자를 제공한 Tree 컬랙션 생성
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
//        Treeset<Fruit> tresSet = new TreeSet<>()

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}

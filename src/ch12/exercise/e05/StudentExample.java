package ch12.exercise.e05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        //Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student 수: " + hashSet.size());
    }
}

package ch17.lecture.p04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {
        // 기본타입 스트림(IntStream, LongStream, DoubleStream) -> 참조타입(Stream<T>)
        int[] arr1 = {1, 3, 5, 7, 9};
        IntStream s1 = Arrays.stream(arr1); // 기본 타입 스트림
        // 기본타입을 참조타입 스트림으로 바꿀때 박싱해야함
        Stream<Integer> s2 = s1.boxed();
        // 참조타입으로 바꼈기때문에, 기본타입의 메소드 사용 불가
        long v2 = s2.count();
        System.out.println("v2 = " + v2);


        // 참조타입(Stream<T>) -> 기본타입 스트림(IntStream, LongStream, DoubleStream)
        // mapToInt, mapToLong, mapToDouble
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        Stream<Integer> s3 = list1.stream();
        IntStream s4 = s3.mapToInt(Integer::intValue);// 참조타입을 기본타입 스트림으로 바꾸는 방법
        long r2 = s4.count();
        System.out.println("r2 = " + r2);


    }
}

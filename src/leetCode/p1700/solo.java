package leetCode.p1700;

import java.util.LinkedList;
import java.util.Queue;

public class solo {
    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1,};
        int[] sandwiches = {0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};

        Queue<Integer> s = new LinkedList<>();
        Queue<Integer> w = new LinkedList<>();
        int num = students.length; // 먹을 학생수

        for (int a : students) {
            s.offer(a);
        }
        for (int a : sandwiches) {
            w.offer(a);
        }
        System.out.println(s);
        System.out.println(w);
        System.out.println("-----");

        int rotations = 0;
        while (!s.isEmpty() && rotations < s.size()) {
            System.out.println("현재 학생 상황" + s);
            System.out.println("현재 샌드위치 상황" + w);
            Integer a = s.poll();

            System.out.println(a);
//            System.out.println(b);
            if (a == w.peek()) {
                num--;
                w.poll();
                System.out.println("샌드위치 먹음");
                System.out.println("남은 학생 현황" + num);
                rotations = 0;
            } else {
                s.offer(a);
                System.out.println("추가합니다." + a);
//                System.out.println("추가합니다." + b);
                rotations++;
            }
            if (num == 0) {
                break;
            }

        }
        System.out.println("못먹은 학생: " + num);
        System.out.println("남은 학생: " + s);
        System.out.println("남은 샌드위치: " + w);
        System.out.println();
    }
}

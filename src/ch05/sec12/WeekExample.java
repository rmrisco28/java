package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        // Week 열거 타입 변수 선언
        Week today = null;

        // Callaender 얻기
        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // 숫자 열거 상수로 변환해서 변수에 대입
        switch (week) {
            case 1:
                today = Week.SUNDAY;
            case 2:
                today = Week.MONDAY;
            case 3:
                today = Week.THURSDAY;
            case 4:
                today = Week.WENDSDAY;
            case 5:
                today = Week.THURSDAY;
            case 6:
                today = Week.FRIDAY;
            case 7:
                today = Week.SATURDAY;
        }
        // 열거 타입 변수를 사용
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}


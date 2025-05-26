package practice.d250526.classArray;

public class App01 {
    public static void main(String[] args) {

/*        //문제 1
        int[] scores = {90, 80, 70, 100, 85};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = sum / scores.length;
        System.out.println(avg);*/

        Student[] student = new Student[3];
        student[0] = new Student("길동", 30);
        student[1] = new Student("철수", 20);
        student[2] = new Student("영희", 10);

        for (int i = 0; i < student.length; i++) {
            System.out.println("학생이름: " + student[i].getName());
        }

        int sum = 0;
        int avg = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i].getAge();
        }
        avg = sum / student.length;
        System.out.println();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
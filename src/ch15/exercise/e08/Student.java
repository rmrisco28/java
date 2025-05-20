package ch15.exercise.e08;

import java.util.Objects;

public class Student {
    public int StudentNum;
    public String name;

    public Student(int studentNum, String name) {
        StudentNum = studentNum;
        this.name = name;
    }
    // 코드 작성


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return StudentNum == student.StudentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(StudentNum);
    }
}

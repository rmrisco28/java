package ch17.sec07.exam02;

public class Student {
    private String name;
    private int socre;

    public Student(String name, int socre) {
        this.name = name;
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public int getSocre() {
        return socre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", socre=" + socre +
                '}';
    }
}

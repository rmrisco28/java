package ch13.exercise.e02;

public class Container<T> {
    private T a;

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }
}

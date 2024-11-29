public class Test<T> {
    private T value;


    public Test(T value) {
        this.value = value;
    }

    public void add(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }


}

import java.util.Arrays;
import java.util.Scanner;

public class MyStack {
    Scanner sc = new Scanner(System.in);

    private static int MAX_SIZE = 10;
    final String[] arr = new String[MAX_SIZE];
    public int pointer = 0;

    public void push(String item) {
        if (pointer == MAX_SIZE) {
            throw new RuntimeException("Can not push, stack is full");
        }
        arr[pointer++] = item;
    }

    public String pop() {
        if (pointer == 0) {
            throw new RuntimeException("Stack is empty");
        }
        String lastElement = arr[--pointer];
        arr[pointer] = null;
        return lastElement;
    }

    public void clear() {
        Arrays.fill(arr, null)
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean isFull() {
        return pointer == MAX_SIZE;
    }

    public int size() {
        return pointer;
    }

    public int capacity() {
        return MAX_SIZE;
    }

    public void showElements() {
        for (int i = 0; i <= pointer; i++) {

        }


    }
}

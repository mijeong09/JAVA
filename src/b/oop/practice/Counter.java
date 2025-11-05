package b.oop.practice;

public class Counter {
    // default 0
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void getCount() {
        System.out.println(count);
    }

    public void reset() {
        count = 0;
    }
}

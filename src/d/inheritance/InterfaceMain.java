package d.inheritance;

abstract class Animal5 {
    abstract void run();
    abstract void sleep();
    abstract void eat();
}

class Dog5 extends Animal5 {
    void run() {}
    void sleep() {}
    void eat() {}
}

// 모든 메서드의 default가 abstract
interface Animal6 {
    void run();
    void sleep();
    void eat();
}

// 의미적으로 구현이 더 맞기 때문에 'implements' 사용
// 중요! 원리 자체는 '상속'이 맞음!
class Dog6 implements Animal6 {
    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}

// -----------------------

interface Drawable {
    void draw();
}

class Rectangle6 implements Drawable {
    private int width, height;

    public Rectangle6 (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Animal6 d = new Dog6();
        d.run();
        d.sleep();
        d.eat();
    }
}

package d.inheritance;

// 추상 클래스
abstract class Animal4 {
    String name;

    public Animal4(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println("sleeping");
    }

    // 추상 메서드 - 제약을 걸기 위한 목적(자식 클래스에서 무조건 구현 해야함)
    abstract void makeSound();
}

// ------------------

abstract class Shape4 {
    String color;

    public Shape4(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println(color);
    }

    abstract double getArea();
    abstract double getPerimeter();
}

// 추상 클래스 상속
abstract class ShapeChild4 extends Shape4 {
    public ShapeChild4(String color) {
        super(color);
    }

//    abstract double getArea();
//    abstract double getPerimeter();
}

class Circle4 extends Shape4 {
    double radius;

    public Circle4(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 3.14 * radius * 2;
    }
}

class Rectangle4 extends Shape4 {
    double width;
    double height;

    public Rectangle4(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }
}

// -------------------


// 완전(순수) 추상 클래스
abstract class Vehicle4 {
    abstract void start();
    abstract void stop();
    abstract int getSpeed();

}

class Car4 extends Vehicle4 {
    int speed;

    @Override
    void start() {
        speed = 30;
        System.out.println("car start");
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("car stop");
    }

    @Override
    int getSpeed() {
        return speed;
    }
}
class Bicycle4 extends Vehicle4 {
    int speed;

    @Override
    void start() {
        speed = 10;
        System.out.println("Bicycle start");
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("Bicycle stop");
    }

    @Override
    int getSpeed() {
        return 0;
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스라 인스턴스 생성 X
        // Animal4 a = new Animal4("동물");

        Shape4 c = new Circle4("red", 5);
        Shape4 r = new Rectangle4("blue", 10, 15);

        c.displayColor();
        r.displayColor();

        System.out.println(c.getArea());
        System.out.println(r.getArea());
    }
}

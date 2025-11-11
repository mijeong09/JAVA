package d.inheritance.practice4;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름" + radius + "인 원을 그림");
    }
}
class Rectangle implements Drawable{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + " * " + height + "인 사각형 그림");
    }
}
class Triangle implements Drawable{
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(base + "," + height + "인 삼각형 그림");
    }
}

public class Practice01 {
    public static void main(String[] args) {
        Drawable[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4)
        };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

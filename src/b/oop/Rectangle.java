package b.oop;

// 객체 선언 == 정의하는 것
public class Rectangle {
    public int width;
    public int height;

    // 생성자만 유일하게 class명과 동일
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}

package b.oop;

public class Intro {
    public static void main(String[] args) {
//        int width = 10;
//        int height = 5;
//        int rectangleArea = width * height;
//
//        System.out.println(rectangleArea);
//
//        // -------
//
//        // 재사용성이 떨어짐
//        int width2 = 100;
//        int height2 = 200;
        int rec1 = calArea(10, 10);
        int rec2 = calArea(20, 30);

        System.out.println(rec1);
    }

    // 클래스: 데이터와(속성) 행동을 하나로 묶은 설계도
    // 메서드: 클래스 안에 있는 함수.
    // JavaScript : function calArea(width, height) {return width * height}
    public static int calArea(int width, int height) {
        return width * height;
    }
}

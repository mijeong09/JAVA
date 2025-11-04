package a.basic.practice;

public class Practice4 {
    public static void main(String[] args) {
        int a = 10, b = 4, c = 5;
        int max;

        if(a > 0 && b > 0 && c > 0) {
            if(((a + b) > c) && ((b + c) > a) && (c + a) > b) {
                System.out.println("삼각형 가능");
            }else System.out.println("삼각형을 만들 수 없습니다.");
        }
    }
}

package a.basic.practice;

public class Practice8 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 17;
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.printf("최댓값: %d", max);
    }
}

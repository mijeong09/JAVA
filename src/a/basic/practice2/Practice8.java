package a.basic.practice2;

public class Practice8 {
    public static void main(String[] args) {
        int a = 48, b = 18;

        // 유클리드 호제법
        while (b != 0) {
            int c = b;

            b = a % b;
            a = c;
        }
        System.out.print(a);
    }
}

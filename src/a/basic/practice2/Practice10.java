package a.basic.practice2;

public class Practice10 {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c = 0;

        for(int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}

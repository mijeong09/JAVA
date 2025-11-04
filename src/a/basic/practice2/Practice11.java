package a.basic.practice2;

public class Practice11 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;

        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        System.out.println(sum);
    }
}


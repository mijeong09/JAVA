package a.basic.practice2;

public class Practice7 {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("소수입니다");
        } else System.out.printf("소수가 아닙니다");

    }
}

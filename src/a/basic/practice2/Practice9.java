package a.basic.practice2;

public class Practice9 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int originA = a, originB = b;
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        System.out.println(originA * originB / a);
    }
}

package a.basic.practice;

public class Practice10 {
    public static void main(String[] args) {
        int price = 120000;
        int disPrice = 0;
        double discount = 0;
        boolean isMember = true;

        if (price > 100000) {
            discount += 0.1;
            System.out.println(discount);

        } else if (price > 50000) {
            discount += 0.05;
        }
        if (isMember == true) {
            discount += 0.05;
        }
        disPrice = price + (int)(price * discount);
        System.out.printf("원가: %d원 \n", price);
        System.out.printf("할인율: %f \n", discount * 100);
        System.out.printf("최종 금액: %d원", disPrice);
    }
}

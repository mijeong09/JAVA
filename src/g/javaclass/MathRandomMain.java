package g.javaclass;

import java.util.HashSet;
import java.util.Random;

public class MathRandomMain {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 50));
        System.out.println(Math.min(20, 40));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(81));

        Random random = new Random();

        int num = random.nextInt(11, 99);
        System.out.println(num);

        int dice = random.nextInt(6) + 1;
        System.out.println(dice);

        HashSet<Integer> lotto = new HashSet<>();

        while(lotto.size() < 6) {
            int number = random.nextInt(1, 45 + 1);
            lotto.add(number);
        }
        System.out.println(lotto);
    }
}

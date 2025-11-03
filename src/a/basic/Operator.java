package a.basic;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a % b);

        int x = 10;
        int y = 3;

        System.out.println(x / y);

        double result = (double) x / y;
        System.out.println(result);

        // 증감 연산자
        // ++x => 증감 이후에 출력, x++ => 출력 이후에 증감
        System.out.println("x = " + x++);
        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 => " + x);

        int bigNum = 999;
        int smallNum = 1;

        System.out.println(bigNum <= smallNum);

        String strA = "hello";
        String strB = "hello";
        String strC = new String("hello");

        System.out.println("strA == strB =>" + (strA == strB));
        System.out.println("strA == strC =>" + (strA == strC));

        System.out.println(strA.equals(strC));


        boolean boolA = true;
        boolean boolB = false;

        System.out.println(boolA && boolB);

        // 단락평가
        int myX = 0;
        if (myX == 0 && x > - 1) {
            System.out.println("실행되나요 ?");
        }

        // 삼항연산자
        int age = 20;
        String adult = (age > 20) ? "성인" : "청소년";
        System.out.println(adult);

        // 비트연산자
        int intA = 14;  // 1110
        int intB = 6;   // 0110
        System.out.println(intA & intB);

        // 기본 연산자 보다 빠름
        int intC = 1234;
        System.out.println(intC << 1);
        System.out.println(intC >> 1);
    }
}

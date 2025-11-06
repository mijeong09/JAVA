package c.oop2;

public class Calculator {
    // int를 반환
    int add (int a, int b) {
        return a + b;
    }
    // 메서드 오버로딩
    int add (int a, int b, int c) {
        return a + b + c;
    }
    // 가변 인자 - 배열로 저장됨
    int add (int ... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // return 값이 X
    void printResult(int result) {
        System.out.println(result);
    }

    // String을 반환
    String printValue(int score) {
        if (score >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }

    // 배열 반환
    int [] getArray() {
        return new int[] {1, 3, 5, 7, 9};
    }
}

package i.lamda;

import java.util.Comparator;
import java.util.function.*;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LamdaMain {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        };

        // 알아서 클래스를 만들어줌
        Comparator<Integer> comparator2 = (a, b) -> Integer.compare(a, b);


        // 람다식 문법

        // 매개변수 X
        Runnable task = () -> System.out.println("실행");
        task.run();

        // 매개변수 1개
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("hi");

        // 매개변수 2개
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;    // 마지막 타입은 리턴 값의 타입
        System.out.println(add.apply(1, 2));

        BiFunction<Integer, Integer, Integer> calc = (a, b) -> {
          int sum = a + b;
          return sum / 2;
        };
        System.out.println(calc.apply(5, 10));


        Calculator cal = (a, b) -> a + b;
        System.out.println(cal.calculate(1, 2));

        Calculator cal2 = (a, b) -> a * b;
        System.out.println(cal.calculate(10, 10));

        // ======================

        // 표준 함수형 인터페이스
        Supplier<String> s = () -> "Hello";
        System.out.println(s.get());

        Consumer<String> c = str -> System.out.println(str);
        c.accept("hello");

        Function<String, Integer> f = str -> str.length();
        System.out.println(f.apply("asdf"));


        // :: - 메서드 참조
        Function<String, Integer> parser1 = str -> Integer.parseInt(str);
        Function<String, Integer> parser2 = Integer::parseInt;
        int result = parser2.apply("123");
        System.out.println(result);

        String prefix = "hihi";
        Function<String, String> greeter1 = name -> prefix.concat(name);
        Function<String, String> greeter2 = prefix::concat;

        String hiResult = greeter2.apply("Kim");
        System.out.println(hiResult);
    }
}

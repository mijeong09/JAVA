package e.generic;
import java.util.*;

public class WildcardGeneric {

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0);
        List<String> strList = Arrays.asList("A", "B", "C");

        printList(intList);
        printList(doubleList);
        printList(strList);

        intList.add(4);
        intList.add(5);

        // 상한 경계
        List<? extends Number> list = intList;
        list.get(0);
        // 컴파일 에러
        // list.add(1);

        // 하한 경계
        List<Number> numberList = new ArrayList();
        List<? super Integer> list2 = numberList;
        list2.add(5);
        // Object 로 읽기 때문에 컴파일 오류
        // int a = list2.get(0);
    }
}

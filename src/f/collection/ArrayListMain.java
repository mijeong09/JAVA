package f.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        String[] a = new String[3];
        ArrayList<String> l = new ArrayList<>();

        l.add("apple");
        l.add("orange");
        l.add(1, "cherry");
        System.out.println(l);

        String f = l.get(0);
        System.out.println(f);

        // 요소 수정
        l.set(2, "grape");

        // 요소 삭제
        l.remove(0);
        l.remove("grape");

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("cherry"));

        // ====================

        ArrayList<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(5, 2, 9, 3, 10, 9));

        System.out.println(intList);

        int index = intList.indexOf(9);
        System.out.println(index);

        int lastIndex = intList.lastIndexOf(9);
        System.out.println(lastIndex);

        List<Integer> subList = intList.subList(2, 5);
        System.out.println(subList);

//        intList.clear();
//        System.out.println(intList);

        Integer[] array = intList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        // =======================

        System.out.print("for-each");
        for (Integer num : intList) {
            System.out.println(num);
        }

        System.out.println("\nindex for");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i));
        }

        System.out.println("\niterator");
        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}

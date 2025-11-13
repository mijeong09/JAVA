package f.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        boolean added = set.add("Apple");   // 중복 추가 X

        System.out.println(set.contains("Melon"));

        set.remove("Apple");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        // set.clear();
        // System.out.println(set.isEmpty());

        for (String item : set) {
            System.out.println(item + " ");
        }

        Set<Integer> intSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> intSet2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

//        intSet1.addAll(intSet2);  // 합집합
//        intSet1.retainAll(intSet2); // 교집합
//        intSet1.removeAll(intSet2); // 차집합

        boolean result = intSet1.containsAll(intSet2);
        System.out.println(intSet1);
        System.out.println(result);
    }
}

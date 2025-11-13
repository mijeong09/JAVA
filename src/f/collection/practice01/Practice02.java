package f.collection.practice01;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice02 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("원본: " + list1);
        int result1 = findAfterRotation(list1, 2, 1);
        System.out.println("2번 회전 후: " + list1);
        System.out.println("1의 인덱스: " + result1);

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("\n원본: " + list2);
        int result2 = findAfterRotation(list2, 1, 40);
        System.out.println("1번 회전 후: " + list2);
        System.out.println("40의 인덱스: " + result2);

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("\n원본: " + list3);
        int result3 = findAfterRotation(list3, 5, 2);
        System.out.println("5번 회전 후 (5%3=2): " + list3);
        System.out.println("2의 인덱스: " + result3);
    }

    public static int findAfterRotation(ArrayList<Integer> list, int k, int target) {
        int index;

        if(list.isEmpty() || list == null) {
            return -1;
        }

        for(int i = 0; i < k % list.size(); i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        return list.indexOf(target);
    }
}

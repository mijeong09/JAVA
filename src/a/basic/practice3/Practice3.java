package a.basic.practice3;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        // sol1
        int index = Arrays.binarySearch(arr, target);

        if(index < 0) {
            index = -1;
        }
        System.out.println(index);

        //sol2
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

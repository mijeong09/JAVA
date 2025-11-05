package a.basic.practice3;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        // sol1
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[(arr.length - 1) - i];
        }
        System.out.println(Arrays.toString(reversed));

        // sol2
        int left = 0;
        int right = arr.length -1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }
}

package a.basic.practice3;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int count = 1;
        int num = 0;

        // sol1
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(num + ":" + count);
                count = 1;
            }
            num = arr[i];
        }
        System.out.println(num + ":" + count);


        // sol2
        int max = arr[0];
        for (int num1 : arr) {
            if (num1 > max) {
                max = num;
            }
        }

        // 카운트 배열
        int[] counts = new int[max + 1];

        // 개수 세기
        for (int num1 : arr) {
            counts[num1]++;
        }
        System.out.println(Arrays.toString(counts));
    }
}

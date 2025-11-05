package a.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 선언, 크기지정
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;

        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        // 배열 초기화
        // 선언 후 한칸씩 할당
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[3] = 3;

        // 선언과 동시에 초기화
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        // 생략 버전
        int[] arr3 = {1, 2, 3, 4, 5};

        String[] names = {"Kim", "Lee", "Park"};

        System.out.println(names.length);


        int[] scores = {80, 40, 80, 90, 100};

        // index 접근
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 요소 반복
        for (int score : scores) {
            System.out.println(score);
        }


        // 2차원 배열
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        int[][] jagged = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        for (int[] row : jagged) {
            for (int item : row) {
                System.out.println(item);
            }
        }


        // Array 유틸리티 클래스
        int[] nums = {5, 2, 1, 7, 8};

        // 참조형이기 때문에데이터 주소가 출력됨
        // System.out.println(nums);
        // - toString() : 배열을 문자열로
        System.out.println(Arrays.toString(nums));

        // - sort() : 정렬
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // - binarySearch() : 이진 탐색
        // 배열이 정렬되어 있어야 이진 탐색 동작이 가능함
        int idx = Arrays.binarySearch(nums, 7);
        System.out.println(idx);

        // - fill() : 배열 채우기
        int[] filled = new int[10];
        Arrays.fill(filled, 99);
        System.out.println(Arrays.toString(filled));

        int[] origin = {1, 2, 3, 4, 5};
        // origin의 데이터를 가져와서 새로운 주소를 만듦
        int[] copied = Arrays.copyOf(origin, origin.length);
        System.out.println(Arrays.toString(copied));

        // copyOf와 달리 origin과 같은 데이터 주소를 가짐
        int[] copied2 = origin;
        System.out.println(Arrays.toString(copied2));
        System.out.println();
        origin[0] = 100;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(copied2));

        int[] ranged = Arrays.copyOfRange(origin, 1, 3);
        System.out.println(Arrays.toString(ranged));

        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};

        // 데이터 주소값이 다름
        System.out.println(arrA == arrB);
        System.out.println(Arrays.equals(arrA, arrB));

        // - deepToString() : 다차원 배열 출력
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(mat));

        origin[99] = 100;
    }
}

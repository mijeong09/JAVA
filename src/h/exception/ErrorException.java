package h.exception;

import java.io.*;

public class ErrorException {
    public static void main(String[] args) {

//        주요 예외 클래스
//        String str = null;
//        System.out.println(str.length());

//        int[] arr = {1, 2, 3};
//        System.out.println(arr[99]);

//        int num = Integer.parseInt("asdf");

//        int age = 10;
//        if (age < 0) {
//            throw new IllegalArgumentException();
//        }

//        try {
//            FileReader fr = new FileReader("a.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            int result = 1 / 0;
//        } catch(ArithmeticException e) {
//            System.out.println("0으로 나눌 수 X");
//        }
//        System.out.println("next code");
//
//        FileReader fr = null;
//        try {
//            // 에러가 생겨도 계속 메모리를 차지하는 중
//            fr = new FileReader("data.txt");
//            fr.read();
//            System.out.println("파일 불러옴");
//        } catch(IOException e) {
//            System.out.println("파일이 존재하지 X");
//        } finally {     // 예외 발생 여부와 관계없이 실행
//            try {
//                fr.close();
//            } catch(IOException e) {
//                System.out.println("close 실패");
//            }
//        }

        try {
            String input = "123";
            int num = Integer.parseInt(input);
            int result = 100 / num;
            FileReader f = new FileReader("test");
        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("모르는 예외");
        }

        try {
            method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void method() throws IOException {
        FileReader f = new FileReader("text");
    }
//        Error - 처리 불가능
//        recursiveMethod();


//        Exception - 처리 가능
//        try {
//            int result = 10 / 0;
//        } catch(ArithmeticException e) {
//            System.out.println("problem : " + e);
//        }

//    static void recursiveMethod() {
//        recursiveMethod();
//    }
}

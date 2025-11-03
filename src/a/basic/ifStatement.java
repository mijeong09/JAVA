package a.basic;

public class ifStatement {
    public static void main(String[] args) {

        // if
        int age = 20;

        if (age >= 20) {
            System.out.println("성인입니다.");
        }

        // if-else
        int score = 89;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("재수강");
        }


        // switch
        int month = 11;

        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 월";
        };
        System.out.println(season);
    }
}

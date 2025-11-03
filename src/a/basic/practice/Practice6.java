package a.basic.practice;

public class Practice6 {
    public static void main(String[] args) {
        int day = 6;
        String [] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        String week = switch (day) {
            case 1, 2, 3, 4, 5 -> "평일";
            case 6, 7 -> "주말";
            default -> "잘못된 입력";
        };

        System.out.printf("%d: %s은 %s입니다.", day, days[day - 1], week);
    }
}

package a.basic.practice;

public class Practice9 {
    public static void main(String[] args) {
        int math = 70, english = 80, science = 45;
        int avg = (math + english + science) / 3;

        if (avg >= 60 && math >= 40 && english >= 40 && science >= 40) {
            System.out.println("합격");
        } else System.out.println("불합격");
    }
}

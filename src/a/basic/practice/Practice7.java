package a.basic.practice;

public class Practice7 {
    public static void main(String[] args) {
        double height = 175.0 / 100;
        double weight = 70.0;
        double BMI = weight / (height * height);
        String bmi;

        if (BMI < 18.5) {
            bmi = "저체중";
        } else if (BMI < 23) {
            bmi = "정상";
        } else if (BMI < 25) {
            bmi = "과체중";
        } else {
            bmi = "비만";
        }

        System.out.printf("BMI: %f \n%s 체중입니다.", BMI, bmi);
    }
}

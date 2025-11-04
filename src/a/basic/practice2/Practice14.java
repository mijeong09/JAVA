package a.basic.practice2;

public class Practice14 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}

package c.oop2;

public class MethodType {
    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod() {
        System.out.println("인스턴스입니다.");
        System.out.printf("staticField: %d\n", staticField);
        System.out.printf("instanceField: %d\n", instanceField);
    }

    static void staticMethod() {
        System.out.println("스태틱입니다.");
        System.out.printf("staticField: %d\n", staticField);
        // System.out.printf("instanceField: %d\n", instanceField);

    }

    public static  void main(String[] args) {
        MethodType mt = new MethodType();
        mt.instanceMethod();
        mt.staticMethod();

        MethodType.staticMethod();
    }
}

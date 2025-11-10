package d.inheritance;

class Parent
{
    void show() {
        System.out.println("parent!");
    }

    // final 메서드는 오버라이딩 할 수 X
    final void display() {
        System.out.println("display!");
    }
}

class Child extends Parent {
    // 오버라이딩
    @Override
    void show() {
         System.out.println("child!");
     }

//     @Override
//     void display() {
//        System.out.println("display!");
//     }
}

public class OverridingMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

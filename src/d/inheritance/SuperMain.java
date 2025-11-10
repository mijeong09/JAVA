package d.inheritance;

class Animal2 {
    String name;
    int age;
    String breed;

    // 기본 생성자
    // Aminal2() {}
    Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("hello" + this.name + this.age);
    }
}

class Dog2 extends Animal2 {
    String breed;

    // 생성자 메서드가 없는 경우?
    // Dog2 () {} -> 자동으로 기본생성자를 만들어줌
    Dog2() {
        super("name", 0);
    }

    Dog2(String name, int age, String breed) {
        super(name, age);
//        this.name = name;
//        this.age = age;
        this.breed = breed;
    }

    void display() {
        // 변수랑 메서드는 항상 가장 가까운 곳에서 먼저 찾는다
        System.out.println(this.breed);
        System.out.println(super.breed);
        System.out.println(breed);
    }

    void introduce() {
        super.introduce();
        System.out.println("멍멍");
    }
}

public class SuperMain {
    public static void main(String[] args) {
        Animal2 a = new Animal2("동물", 0);
        Dog2 d = new Dog2("초코", 3, "말티즈");

        System.out.println(a.breed);
        System.out.println(d.breed);

        d.display();

        d.introduce();
        a.introduce();
    }
}

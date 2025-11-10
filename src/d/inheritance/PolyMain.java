package d.inheritance;

import org.w3c.dom.ls.LSOutput;

class Animal3 {
    void makeSound() {
        System.out.println("소리냄");
    }
}

class Dog3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }

    void bark() {
        System.out.println("왈왈");
    }
}

class Cat3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("냥냥");
    }

    void meow() {
        System.out.println("meow");
    }
}

class Bird3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("짹짹");
    }
}

class Rabbit3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("깡총");
    }
}

public class PolyMain {
    public static void main(String[] args) {
//        Dog3 d = new Dog3();
//        Cat3 c = new Cat3();
//        Bird3 b = new Bird3();

//        d.makeSound();
//        c.makeSound();
//        d.makeSound();

        Animal3 a1 = new Dog3();
        Animal3 a2 = new Cat3();
        Animal3 a3 = new Bird3();
        Animal3 a4 = new Rabbit3();
        Animal3[] aminals = {
                new Dog3(),
                new Cat3(),
                new Bird3(),
                new Rabbit3()
        };

        for (Animal3 animal : aminals) {
            animal.makeSound();
        }

        soundAnimal(a1);
        soundAnimal(a2);
        soundAnimal(a3);
        soundAnimal(a4);

        System.out.println("---------");

        // 그대로 저장
        Dog3 d1 = new Dog3();
        d1.makeSound();
        d1.bark();

        // 다형성 적용 (업캐스팅)
        Animal3 d2 = new Dog3();
        d2.makeSound();
        // 접근 불가
        // d2.bark();

        // 다운캐스팅
        Animal3 c1 = new Cat3();
        // c1.meow();

        Cat3 c2 = (Cat3) c1;
        c2.meow();

        System.out.println("-------");

        // 다운캐스팅 전에 타입 확인
        System.out.println(c2 instanceof Animal3);
        System.out.println(c2 instanceof Cat3);
//        System.out.println(c2 instanceof Dog3);


    }

    static void soundAnimal(Animal3 animal) {
        animal.makeSound();
    }
}

package d.inheritance;

class Animal7 {
    public void eat() {
        System.out.println("eating");
    }
}

// interface를 기능별로
interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

class Duck implements Swimmable, Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("오리가 날아감");
    }

    @Override
    public void swim() {
        System.out.println("오리가 수영함");
    }

    @Override
    public void walk() {
        System.out.println("오리 걸어감");
    }
}
// 상속(구현되어 있는 메소드 상속) + 구현(구현 안된 메소드 상속)
class Fish extends Animal7 implements Swimmable {
    @Override
    public void swim() {
        System.out.println("물고기 수영중");
    }
}

public class MultiInterfaceMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();

        duck.swim();
        duck.fly();
        fish.swim();
    }
}

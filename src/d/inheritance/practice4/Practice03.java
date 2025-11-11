package d.inheritance.practice4;

interface Swimmable {
    void swim();
}
interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " fly");
    }

    @Override
    public void swim() {
        System.out.println(name + " swim");

    }
}
class Fish implements Swimmable {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + "swim");
    }
}
class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "fly");
    }
}

public class Practice03 {
    public static void main(String[] args) {
        Duck duck = new Duck("오리");
        duck.swim();
        duck.fly();
        System.out.println();

        Fish fish = new Fish("물고기");
        fish.swim();
        System.out.println();

        Bird bird = new Bird("참새");
        bird.fly();
    }
}

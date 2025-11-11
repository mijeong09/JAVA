package d.inheritance.practice2;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("소리를 냄");
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("어흥");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("뿌우우");
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("끼끼");
    }

}

class Zoo {
    Animal[] animals = {};
    int count;

    public Zoo(int capacity) {
        this.animals = new Animal[capacity];
        this.count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void feedingTime() {
        for (int i = 0; i < count; i++) {
            System.out.print(animals[i].name + " : ");
            animals[i].makeSound();
        }
    }
}

public class Practice01 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        zoo.addAnimal(new Lion("심바", 5));
        zoo.addAnimal(new Elephant("덤보", 10));
        zoo.addAnimal(new Monkey("우끼", 3));

        zoo.feedingTime();
    }
}
